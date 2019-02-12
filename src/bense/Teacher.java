package bense;

public class Teacher {
    private String teacher_id;  //生活老师编号
    private String teacher_name;  //生活老师姓名
    private String teacher_pri;  //生活老师照片
    private String teacher_tel;  //生活老师联系方式
    private int apartment_id;   //负责公寓号
    private String teacher_introduce;    //个人简介

    public int getApartment_id() {
        return apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }

    public String getTeacher_introduce() {
        return teacher_introduce;
    }

    public void setTeacher_introduce(String teacher_introduce) {
        this.teacher_introduce = teacher_introduce;
    }

    public Teacher() {
    }

    public Teacher(String teacher_id, String teacher_name, String teacher_pri, String teacher_tel) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.teacher_pri = teacher_pri;
        this.teacher_tel = teacher_tel;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_pri() {
        return teacher_pri;
    }

    public void setTeacher_pri(String teacher_pri) {
        this.teacher_pri = teacher_pri;
    }

    public String getTeacher_tel() {
        return teacher_tel;
    }

    public void setTeacher_tel(String teacher_tel) {
        this.teacher_tel = teacher_tel;
    }
}
