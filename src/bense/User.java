package bense;

public class User {
    private String user_id;  //用户账号
    private String user_password;  //用户密码
    private int user_s; //用户身份

    public User() {
    }

    public User(String user_id, String user_password, int user_s) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.user_s = user_s;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_s() {
        return user_s;
    }

    public void setUser_s(int user_s) {
        this.user_s = user_s;
    }
}
