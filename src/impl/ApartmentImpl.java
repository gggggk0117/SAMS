package impl;

import bense.Apartment;
import dao.ApartmentDao;
import db.DBUtil;

import java.sql.*;
import java.util.List;

public class ApartmentImpl implements ApartmentDao {
    ResultSet rows = null;
    PreparedStatement ps = null;
    Connection conn = DBUtil.getConn();
    @Override
    public List<Apartment> getAllApartment() {
        return null;
    }

    @Override
    public int insertApartment(Apartment stu) {
        Boolean sex=false;
        if (stu.getApartment_sex().equals("男生")){
            sex=true;
        }else {
            sex=false;
        }
        int r=0;
        try {
            ps=conn.prepareStatement("insert into apartment " +
                    "(apartment_name, floor_num, apartment_sex, apartment_notice, apartment_rule)" +
                    "value (?,?,?,?,?)");
            ps.setString(1,stu.getApartment_name());
            ps.setInt(2,stu.getFloor_num());
            ps.setBoolean(3,sex);
            ps.setString(4,stu.getApartment_notice());
            ps.setString(5,stu.getApartment_rule());
            r=ps.executeUpdate();
            DBUtil.free(rows,ps,conn);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public int updateApartment(Apartment stu) {
        Boolean sex=false;
        if (stu.getApartment_sex().equals("男生")){
            sex=true;
        }else {
            sex=false;
        }
        int r=0;
        try {
            ps=conn.prepareStatement("update apartment " +
                    "set apartment_name=?,floor_num=?,apartment_sex=?,apartment_notice=?,apartment_rule=?" +
                    "where apartment_id =? ");
            ps.setString(1,stu.getApartment_name());
            ps.setInt(2,stu.getFloor_num());
            ps.setBoolean(3,sex);
            ps.setString(4,stu.getApartment_notice());
            ps.setString(5,stu.getApartment_rule());
            ps.setInt(6,stu.getApartment_id());
            r=ps.executeUpdate();
            DBUtil.free(rows,ps,conn);
            System.out.println("更新成功 r=  "+r);
            return r;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public int deleteApartment(int id, String name) {
        return 0;
    }

    @Override
    public Apartment find(int id) {
        Apartment apartment =new Apartment();
        Boolean sex=false;
        try {
            ps = conn.prepareStatement("select * from apartment where apartment_id=?");
            ps.setInt(1,id);
             rows = ps.executeQuery();
            while (rows.next()){
                apartment.setApartment_id(rows.getInt("apartment_id"));
                apartment.setApartment_name(rows.getString("apartment_name"));
                apartment.setFloor_num(rows.getInt("floor_num"));
                System.out.println("floor_num  =  "+apartment.getFloor_num());
                sex=(rows.getBoolean("apartment_sex"));
                if (sex){
                    apartment.setApartment_sex("男生");
                }else {
                    apartment.setApartment_sex("女生");
                }
                apartment.setApartment_notice(rows.getString("apartment_notice"));
                apartment.setApartment_rule(rows.getString("apartment_rule"));
            }
            DBUtil.free(rows,ps,conn);
            return apartment;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
