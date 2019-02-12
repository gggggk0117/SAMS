package impl;

import bense.discipline;
import dao.DisciplineDao;
import db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplineImpl implements DisciplineDao {
    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement ps = null;

    @Override
    public List<discipline> getAllDiscipline() {
        return null;
    }

    @Override
    public List<discipline> getAllDisQuery(int id) {
//        int sum=0;
        List<discipline> list = new ArrayList<discipline>();
        try {
            conn = DBUtil.getConn();
            ps = conn.prepareStatement("select * from discipline limit ?,6");
            ps.setInt(1, (id-1)* 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                discipline dis = new discipline();
                dis.setDiscipline_id(rs.getInt("discipline_id"));
                dis.setStudent_dnum(rs.getString("student_dnum"));
                dis.setStudent_id(rs.getString("student_id"));
                dis.setStudent_name(rs.getString("student_name"));
                dis.setDiscipline_time(rs.getString("discipline_time"));
                dis.setStudent_collegee(rs.getString("student_collegee"));
                dis.setDiscipline_reason(rs.getString("discipline_reason"));
                dis.setDiscipline_note(rs.getString("discipline_note"));
                list.add(dis);
            }
            DBUtil.free(rs, ps, conn);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public int insertDiscipline(discipline dis) {
        int rows = 0;
        try {
            conn = DBUtil.getConn();
            if (dis.getStudent_id().length() >= 6) {
                ps = conn.prepareStatement("insert into discipline " +
                        "(student_id,student_name,discipline_write,discipline_red," +
                        "discipline_time,student_collegee,discipline_reason,discipline_note)" +
                        "value (?,?,?,?,?,?,?,?)");
            } else {
                ps = conn.prepareStatement("insert into discipline " +
                        "(student_dnum,student_name,discipline_write,discipline_red," +
                        "discipline_time,student_collegee,discipline_reason,discipline_note)" +
                        "value (?,?,?,?,?,?,?,?)");
            }

            ps.setString(1, dis.getStudent_id());
            ps.setString(2, dis.getStudent_name());
            ps.setString(3, dis.getDiscipline_write());
            ps.setString(4, dis.getDiscipline_red());
            ps.setString(5, dis.getDiscipline_time());
            ps.setString(6, dis.getStudent_collegee());
            ps.setString(7, dis.getDiscipline_reason());
            ps.setString(8, dis.getDiscipline_note());
            rows = ps.executeUpdate();
            DBUtil.free(rs, ps, conn);
            return rows;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("rows=" + rows);
        return rows;
    }

    @Override
    public int updateDiscipline(discipline dis) {
        return 0;
    }

    @Override
    public int deleteDiscipline(String student_dnum, String student_id) {
        return 0;
    }

    @Override
    public discipline find(String student_dnum, String student_id) {
        return null;
    }

    /*
    查找记录总数
     */
    @Override
    public int QuerySum() {
        int sum = 0;
        List  sum1=new ArrayList();
        try {
            conn = DBUtil.getConn();
             ps = conn.prepareStatement("select count(*) from discipline");
            rs = ps.executeQuery();
            while (rs.next()){
            sum=rs.getInt(1);}
//            System.out.println("我是 查询 sum=  "+sum);
            DBUtil.free(rs, ps, conn);
//            System.out.println("sum=  " + sum);
            return sum;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sum;
    }
}