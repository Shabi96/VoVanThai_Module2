package ss12_java_collection_framework.bai_tap.quan_ly_san_pham.model;

public class Car extends Product {
    private int amount;

    public Car() {
    }

    public Car(int amount) {
        this.amount = amount;
    }

    public Car(int id, String name, double price, int amount) {
        super(id, name, price);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", amount=" + amount +
                '}';
    }
}
