package impl;

import bense.User;
import dao.UserDao;
import db.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserImpl implements UserDao {
    Connection conn = DBUtil.getConn();
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String user_id, String user_password) {
        return 0;
    }

    @Override
    public User find(String user_id, String user_password) {
        User user = new User();
        try {
            PreparedStatement ps  = conn.prepareStatement("select * from user  where user_id=?");
            ps.setString(1,user_id);
            ResultSet rows = ps.executeQuery();
            while (rows.next()){
                user.setUser_id(rows.getString("user_id"));
                user.setUser_password(rows.getString("user_password"));
                user.setUser_s(rows.getInt("user_s"));
            }
            DBUtil.free(null,ps,conn);
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
