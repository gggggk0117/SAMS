package dao;

import bense.Apartment;

import java.util.List;

public interface ApartmentDao {
    public List<Apartment> getAllApartment();//显示所有

    public int insertApartment(Apartment stu);//添加

    public int updateApartment(Apartment stu);//更新

    public int deleteApartment(int id, String name);//删除

    public Apartment find(int id);  //添加指定
}
