package dao;

import bense.Students;

import java.util.List;

public interface StudentsDao {

    public List<Students> getAllStudents();//显示所有

    public int insertStudents(Students stu);//添加

    public int updateStudnets(Students stu);//更新

    public int deleteStudents(String id, String name);//删除

    public Students find(String id);  //添加指定

    public Students findDiscipline(String id);
}
