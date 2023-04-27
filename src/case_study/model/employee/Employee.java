package case_study.model.employee;

public class Employee extends Person {
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String level, String position, double wage) {
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String code, String name, String dayOfBirth, String gender, String id , String phone, String email, String level, String position, double wage) {
        super(code , name, dayOfBirth, gender, id, phone, email);
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", id=" + getId() +
                ", phone=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String writeToFile() {
        return super.getCode() + "," + super.getName() + "," + super.getDayOfBirth() + "," +
                super.getGender() + "," + super.getId() + "," + super.getPhone() + "," + super.getEmail()
                + "," + level + "," + position + "," + wage;
    }
}
