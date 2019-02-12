package bense;

public class Maintain {
    private int maintain_id;   //序号
    private String maintain_damage;  //破损情况
    private String student_name;  //学生姓名
    private String student_dnum;  //数量
    private String student_tel;  //维修宿舍联系电话
    private String maintain_result;  //处理结果
    private String maintain_time;  //处理时间

    public Maintain() {
    }

    public Maintain(int maintain_id, String maintain_damage, String student_name, String student_dnum, String student_tel, String maintain_result, String maintain_time) {
        this.maintain_id = maintain_id;
        this.maintain_damage = maintain_damage;
        this.student_name = student_name;
        this.student_dnum = student_dnum;
        this.student_tel = student_tel;
        this.maintain_result = maintain_result;
        this.maintain_time = maintain_time;
    }

    public int getMaintain_id() {
        return maintain_id;
    }

    public void setMaintain_id(int maintain_id) {
        this.maintain_id = maintain_id;
    }

    public String getMaintain_damage() {
        return maintain_damage;
    }

    public void setMaintain_damage(String maintain_damage) {
        this.maintain_damage = maintain_damage;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_dnum() {
        return student_dnum;
    }

    public void setStudent_dnum(String student_dnum) {
        this.student_dnum = student_dnum;
    }

    public String getStudent_tel() {
        return student_tel;
    }

    public void setStudent_tel(String student_tel) {
        this.student_tel = student_tel;
    }

    public String getMaintain_result() {
        return maintain_result;
    }

    public void setMaintain_result(String maintain_result) {
        this.maintain_result = maintain_result;
    }

    public String getMaintain_time() {
        return maintain_time;
    }

    public void setMaintain_time(String maintain_time) {
        this.maintain_time = maintain_time;
    }
}
