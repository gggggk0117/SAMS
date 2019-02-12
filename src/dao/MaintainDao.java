package dao;

import bense.Maintain;

import java.util.List;

public interface MaintainDao {

    public List<Maintain> getAllMaintain();  //显示

    public int insertMaintain(Maintain mat);//新的订单

    public int updateStudents(Maintain mat);//更新

    public int deleteStudents(String student_name, String student_dnum);//删除订单

    public Maintain find(String student_name, String student_dnum);//根据报修寝室和报修人 查找
}
