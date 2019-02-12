package dao;

import bense.Teacher;

import java.util.List;

public interface TeacherDao {
    public List<Teacher>  getAllTeacher();  //显示 所有生活老师

    public int insertTeacher(Teacher tea); //添加老师

    public int updateTeacher(Teacher tea); //更新老师

    public int deleteTeacher(String id, String name);//删除

    public Teacher find(int id);//查找指定老师

    public Teacher find(String id);
}
