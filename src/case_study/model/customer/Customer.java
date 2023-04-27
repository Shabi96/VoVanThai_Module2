package case_study.model.customer;

import case_study.model.employee.Person;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfGuest, String address) {
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String code, String name, String dayOfBirth, String gender, String id, String phone, String email, String typeOfGuest, String address) {
        super(code, name, dayOfBirth, gender, id, phone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", id=" + getId() +
                ", phone=" + getPhone() +
                ", email='" + getEmail() + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String WriteToFile() {
        return super.getCode() + "," + super.getName() + "," + super.getDayOfBirth() + ","
                + super.getGender() + "," + super.getId() + "," + super.getPhone()
                + "," + super.getEmail() + "," + typeOfGuest + "," + address;
    }
}
