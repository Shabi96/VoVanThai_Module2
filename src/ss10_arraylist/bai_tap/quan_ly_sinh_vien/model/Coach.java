package ss10_arraylist.bai_tap.quan_ly_sinh_vien.model;

public class Coach extends CodeGym {
    private String specialize;

    public Coach() {
    }

    public Coach(String specialize) {
        this.specialize = specialize;
    }

    public Coach(int id, String name, String date, String gender, String specialize) {
        super(id, name, date, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Coach{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() +
                ", gender='" + getGender() + '\'' +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
