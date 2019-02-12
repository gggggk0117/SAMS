package dao;

import bense.Sanitary;

import java.util.List;

public interface SanitaryDao {
    public List<Sanitary> getAllSanitary();//显示

    public int insertSanitary(Sanitary san); //添加

    public int updateSanitary(Sanitary san); //更新

    public int deleteSanitary(String student_dnum);//删除

    public Sanitary find(String student_dnum);

    public Sanitary findNum(int sanitary_num);//按分数 查找
}
