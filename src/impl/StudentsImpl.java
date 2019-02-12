package impl;

import bense.Students;
import dao.StudentsDao;
import db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsImpl implements StudentsDao {

    ResultSet rs=null;
    Connection conn=null;
    PreparedStatement ps=null;

    @Override
    public List<Students> getAllStudents() {
        List<Students> list=new ArrayList<Students>();
        try {
            conn=DBUtil.getConn();
            ps=conn.prepareStatement("SELECT * from student");
            rs=ps.executeQuery();

            while (rs.next()){
                Students stu=new Students();
                stu.setStudent_id(rs.getString("student_id"));
                stu.setStudent_name(rs.getString("student_name"));
                stu.setStudent_sex(rs.getBoolean("student_sex"));
                stu.setStudent_tel(rs.getString("student_tel"));
                stu.setStudent_pri(rs.getString("student_pri"));
                stu.setStudent_dnum(rs.getString("student_dnum"));
                stu.setStudent_date(rs.getString("student_date"));
                stu.setStudent_college(rs.getString("student_college"));
                list.add(stu);
            }
            DBUtil.free(rs,ps,conn);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insertStudents(Students stu) {
        return 0;
    }

    @Override
    public int updateStudnets(Students stu) {
        return 0;
    }

    @Override
    public int deleteStudents(String id, String name) {
        return 0;
    }

    @Override
    public Students find(String id) {
        Students stu = new Students();
        try {
            conn= DBUtil.getConn();
            PreparedStatement ps  = conn.prepareStatement("select * from student where student_id=?");
            ps.setString(1,id);
            ResultSet rows = ps.executeQuery();
            while (rows.next()){
                stu.setStudent_id(rows.getString("student_id"));
                stu.setStudent_name(rows.getString("student_name"));
                stu.setStudent_sex(rows.getBoolean("student_sex"));
                stu.setStudent_tel(rows.getString("student_tel"));
                stu.setStudent_pri(rows.getString("student_pri"));
                stu.setStudent_dnum(rows.getString("student_dnum"));
                stu.setStudent_date(rows.getString("student_date"));
                stu.setStudent_college(rows.getString("student_college"));
            }
            DBUtil.free(null,ps,conn);
            return stu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //违纪 查询
    @Override
    public Students findDiscipline(String id) {
        conn= DBUtil.getConn();
        int num=id.length();
        Students students=new Students();
        try {
            //能不能写个标识。。。
            if (num>=6) {
                ps = conn.prepareStatement("select * from student where student_id=?");
            }else {
                ps = conn.prepareStatement("select * from student where student_dnum=?");
            }
            ps.setString(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                students.setStudent_name(rs.getString("student_name"));
                students.setStudent_sex(rs.getBoolean("student_sex"));
                students.setStudent_dnum(rs.getString("student_dnum"));
                students.setStudent_tel(rs.getString("student_tel"));
                students.setStudent_college(rs.getString("student_college"));
                students.setStudent_class(rs.getString("student_class"));
            }
            DBUtil.free(rs,ps,conn);
            return students;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
