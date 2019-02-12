package impl;

import bense.Teacher;
import dao.TeacherDao;
import db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherImpl implements TeacherDao {
    Connection conn = DBUtil.getConn();
    @Override
    public List<Teacher> getAllTeacher() {
        return null;
    }

    @Override
    public int insertTeacher(Teacher tea) {
        return 0;
    }

    @Override
    public int updateTeacher(Teacher tea) {
        return 0;
    }

    @Override
    public int deleteTeacher(String id, String name) {
        return 0;
    }

    @Override
    public Teacher find(int id) {
        PreparedStatement ps  = null;
        Teacher teacher =new Teacher();
        try {
            ps = conn.prepareStatement("select * from teacher where Apartment_id=?");
            ps.setInt(1,id);
            ResultSet rows = ps.executeQuery();
            while (rows.next()){
                teacher.setTeacher_id(rows.getString("teacher_id"));
                teacher.setTeacher_name(rows.getString("teacher_name"));
                System.out.println(teacher.getTeacher_name()+"数据库");
                teacher.setTeacher_pri(rows.getString("teacher_pri"));
                teacher.setApartment_id(rows.getInt("apartment_id"));
                teacher.setTeacher_tel(rows.getString("teacher_tel"));
                teacher.setTeacher_introduce(rows.getString("teacher_introduce"));
            }
            DBUtil.free(null,ps,conn);
            return teacher;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Teacher find(String id) {
        PreparedStatement ps  = null;
        Teacher teacher =new Teacher();
        try {
            ps = conn.prepareStatement("select * from teacher where teacher_id=?");
            ps.setString(1,id);
            ResultSet rows = ps.executeQuery();
            while (rows.next()){
                teacher.setTeacher_id(rows.getString("teacher_id"));
                teacher.setTeacher_name(rows.getString("teacher_name"));
                System.out.println(teacher.getTeacher_name()+"数据库");
                teacher.setTeacher_pri(rows.getString("teacher_pri"));
                teacher.setApartment_id(rows.getInt("apartment_id"));
                teacher.setTeacher_tel(rows.getString("teacher_tel"));
                teacher.setTeacher_introduce(rows.getString("teacher_introduce"));
            }
            DBUtil.free(null,ps,conn);
            return teacher;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
