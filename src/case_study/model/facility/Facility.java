package case_study.model;

public abstract class Facility {
    private int id;
    private String name;
    private double area;
    private double price;
    private int amount;
    private static String time;
    static {
        String[] arr = new String[4];
        arr[0] = "YEAR";
        arr[1] = "MONTH";
        arr[2] = "DAY";
        arr[3] = "HOUR";
    }

    public Facility() {
    }

    public Facility(int id, String name, double area, double price, int amount) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
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

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        Facility.time = time;
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
