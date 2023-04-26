package case_study.model.facility;

public abstract class Facility {
    private int id;
    private String name;
    private double area;
    private double price;
    private int amount;
    private  String time;

    public Facility() {
    }

    public Facility(int id, String name, double area, double price, int amount, String time) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
