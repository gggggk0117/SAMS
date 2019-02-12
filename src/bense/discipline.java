package bense;

public class discipline {
    private int discipline_id;    //违纪Id
    private String student_dnum;  //违纪宿舍号
    private String student_id;  //违纪学号
    private String student_name;  //违纪姓名
    private String discipline_write;  //判断个人还是寝室
    private String discipline_red;  //是否评优
    private String discipline_time;  //违纪时间
    private String student_collegee;  //学院
    private String discipline_reason;  //理由
    private String discipline_note;  //备注


    public discipline() {
    }

    //按学号添加
    public discipline(String student_id, String student_name, String discipline_write, String discipline_red, String discipline_time, String student_collegee, String discipline_reason, String discipline_note) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.discipline_write = discipline_write;
        this.discipline_red = discipline_red;
        this.discipline_time = discipline_time;
        this.student_collegee = student_collegee;
        this.discipline_reason = discipline_reason;
        this.discipline_note = discipline_note;
    }

    public int getDiscipline_id() {
        return discipline_id;
    }

    public void setDiscipline_id(int discipline_id) {
        this.discipline_id = discipline_id;
    }

    public String getStudent_dnum() {
        return student_dnum;
    }

    public void setStudent_dnum(String student_dnum) {
        this.student_dnum = student_dnum;
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

    public String getDiscipline_write() {
        return discipline_write;
    }

    public void setDiscipline_write(String discipline_write) {
        this.discipline_write = discipline_write;
    }

    public String getDiscipline_red() {
        return discipline_red;
    }

    public void setDiscipline_red(String discipline_red) {
        this.discipline_red = discipline_red;
    }

    public String getDiscipline_time() {
        return discipline_time;
    }

    public void setDiscipline_time(String discipline_time) {
        this.discipline_time = discipline_time;
    }

    public String getStudent_collegee() {
        return student_collegee;
    }

    public void setStudent_collegee(String student_collegee) {
        this.student_collegee = student_collegee;
    }

    public String getDiscipline_reason() {
        return discipline_reason;
    }

    public void setDiscipline_reason(String discipline_reason) {
        this.discipline_reason = discipline_reason;
    }

    public String getDiscipline_note() {
        return discipline_note;
    }

    public void setDiscipline_note(String discipline_note) {
        this.discipline_note = discipline_note;
    }
}


