package db;

import java.sql.*;

public class DBUtil {

    private static String url="jdbc:mysql://localhost:3306/sams?userUnicode=true&characterEncoding=utf-8";
    private static String username="root";
    private static String password="1475693";

    private static Connection conn;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        try {
            conn= DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();

      }
        return conn;
    }

    public static void free(ResultSet rs, Statement st, Connection conn){
        if (rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (st!=null)
        {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
