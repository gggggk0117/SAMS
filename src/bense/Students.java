package bense;

public class Students {
    private String student_id;  //学号
    private String student_name;  //姓名
    private boolean student_sex;  //学生性别
    private String student_tel;   //学生联系方式
    private String student_pri;   //学生照片
    private String student_dnum;   //学生宿舍号
    private String student_date;   //入学日期
    private String student_college;   //学院
    private String student_class;     //班级
    private int apartment_id;

    public Students() {
    }

    public Students(String student_id, String student_name, boolean student_sex, String student_tel, String student_pri, String student_dnum, String student_date, String student_college) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_sex = student_sex;
        this.student_tel = student_tel;
        this.student_pri = student_pri;
        this.student_dnum = student_dnum;
        this.student_date = student_date;
        this.student_college = student_college;
    }

    public Students(String student_id, String student_name, boolean student_sex, String student_tel, String student_pri, String student_dnum, String student_date, String student_college, String student_class) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_sex = student_sex;
        this.student_tel = student_tel;
        this.student_pri = student_pri;
        this.student_dnum = student_dnum;
        this.student_date = student_date;
        this.student_college = student_college;
        this.student_class = student_class;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public boolean isStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(boolean student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_tel() {
        return student_tel;
    }

    public void setStudent_tel(String student_tel) {
        this.student_tel = student_tel;
    }

    public String getStudent_pri() {
        return student_pri;
    }

    public void setStudent_pri(String student_pri) {
        this.student_pri = student_pri;
    }

    public String getStudent_dnum() {
        return student_dnum;
    }

    public void setStudent_dnum(String student_dnum) {
        this.student_dnum = student_dnum;
    }

    public String getStudent_date() {
        return student_date;
    }

    public void setStudent_date(String student_date) {
        this.student_date = student_date;
    }

    public String getStudent_college() {
        return student_college;
    }

    public void setStudent_college(String student_college) {
        this.student_college = student_college;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }
    public int getApartment_id() { return apartment_id;}

    public void setApartment_id(int apartment_id) { this.apartment_id = apartment_id; }
}

