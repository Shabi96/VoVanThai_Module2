package ss10_arraylist.bai_tap.quan_ly_sinh_vien.model;

public class Student extends CodeGym {
    private String classes;
    private int point;

    public Student(String classes, int point) {
        this.classes = classes;
        this.point = point;
    }

    public Student(int id, String name, String date, String gender, String classes, int point) {
        super(id, name, date, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", date=" + getDate() +
                ", gender='" + getGender() + '\'' +
                ", classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
