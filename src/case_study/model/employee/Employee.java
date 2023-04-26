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

    public Employee(int id, String name, String dayOfBirth, String gender, int cmnd, int phone, String email, String level, String position, double wage) {
        super(id, name, dayOfBirth, gender, cmnd, phone, email);
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
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", cmnd=" + getCmnd() +
                ", phone=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String writeToFile() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," +
                super.getGender() + "," + super.getCmnd() + "," + super.getPhone() + "," + super.getEmail()
                + "," + level + "," + position + "," + wage;
    }
}
