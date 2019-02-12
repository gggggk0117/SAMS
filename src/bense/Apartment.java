package bense;

public class Apartment {

    private int apartment_id;   //公寓号
    private String apartment_name;//公寓名
    private int floor_num;     //楼层数
    private String apartment_sex;//公寓性别
    private String apartment_notice;//公寓通知
    private String apartment_rule;//公寓规则

    public Apartment() {
    }

    public Apartment(int apartment_id, String apartment_name, int floor_num, String apartment_sex, String apartment_notice, String apartment_rule) {
        this.apartment_id = apartment_id;
        this.apartment_name = apartment_name;
        this.floor_num = floor_num;
        this.apartment_sex = apartment_sex;
        this.apartment_notice = apartment_notice;
        this.apartment_rule = apartment_rule;
    }

    public Apartment(String apartment_name, int floor_num, String apartment_sex, String apartment_notice, String apartment_rule) {
        this.apartment_name = apartment_name;
        this.floor_num = floor_num;
        this.apartment_sex = apartment_sex;
        this.apartment_notice = apartment_notice;
        this.apartment_rule = apartment_rule;
    }

    public int getApartment_id() {
        return apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }

    public String getApartment_name() {
        return apartment_name;
    }

    public void setApartment_name(String apartment_name) {
        this.apartment_name = apartment_name;
    }

    public int getFloor_num() {
        return floor_num;
    }

    public void setFloor_num(int floor_num) {
        this.floor_num = floor_num;
    }

    public String getApartment_sex() {
        return apartment_sex;
    }

    public void setApartment_sex(String apartment_sex) {
        this.apartment_sex = apartment_sex;
    }

    public String getApartment_notice() {
        return apartment_notice;
    }

    public void setApartment_notice(String apartment_notice) {
        this.apartment_notice = apartment_notice;
    }

    public String getApartment_rule() {
        return apartment_rule;
    }

    public void setApartment_rule(String apartment_rule) {
        this.apartment_rule = apartment_rule;
    }
}
