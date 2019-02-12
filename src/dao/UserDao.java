package dao;

import bense.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUser();//显示所有用户

    public int insertUser(User user);//添加用户

    public int updateUser(User user);//更新用户

    public int deleteUser(String user_id, String user_password);

    public User find(String user_id, String user_password);//指定查找
}
