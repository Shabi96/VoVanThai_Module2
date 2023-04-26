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

    public Customer(int id, String name, String dayOfBirth, String gender, int cmnd, int phone, String email, String typeOfGuest, String address) {
        super(id, name, dayOfBirth, gender, cmnd, phone, email);
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
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String WriteToFile() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + ","
                + super.getGender() + "," + super.getCmnd() + "," + super.getPhone()
                + "," + super.getEmail() + "," + typeOfGuest + "," + address;
    }
}
