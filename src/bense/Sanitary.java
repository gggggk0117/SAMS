package bense;

public class Sanitary {
    private int sanitary_id;   //卫生编号
    private String student_dnum;  //宿舍号
    private String sanitary_situation;  //扣分原因
    private int sanitary_num;     //分数
    private String sanitary_time;  //检查时间

    public Sanitary() {
    }

    public Sanitary(int sanitary_id, String student_dnum, String sanitary_situation, int sanitary_num, String sanitary_time) {
        this.sanitary_id = sanitary_id;
        this.student_dnum = student_dnum;
        this.sanitary_situation = sanitary_situation;
        this.sanitary_num = sanitary_num;
        this.sanitary_time = sanitary_time;
    }

    public int getSanitary_id() {
        return sanitary_id;
    }

    public void setSanitary_id(int sanitary_id) {
        this.sanitary_id = sanitary_id;
    }

    public String getStudent_dnum() {
        return student_dnum;
    }

    public void setStudent_dnum(String student_dnum) {
        this.student_dnum = student_dnum;
    }

    public String getSanitary_situation() {
        return sanitary_situation;
    }

    public void setSanitary_situation(String sanitary_situation) {
        this.sanitary_situation = sanitary_situation;
    }

    public int getSanitary_num() {
        return sanitary_num;
    }

    public void setSanitary_num(int sanitary_num) {
        this.sanitary_num = sanitary_num;
    }

    public String getSanitary_time() {
        return sanitary_time;
    }

    public void setSanitary_time(String sanitary_time) {
        this.sanitary_time = sanitary_time;
    }
}
