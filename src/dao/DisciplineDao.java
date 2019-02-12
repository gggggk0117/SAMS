package dao;




import bense.discipline;

import java.util.List;

public interface DisciplineDao {
   public List<discipline> getAllDiscipline();//显示所有

    public List<discipline>getAllDisQuery(int id);   //按 学号或宿舍号显示所有

    public int insertDiscipline(discipline dis);//添加

    public int updateDiscipline(discipline dis);//更新

    public int deleteDiscipline(String student_dnum, String student_id);//删除

    public discipline find(String student_dnum, String student_id);  //添加指定

    public int QuerySum();//查找数量
}
