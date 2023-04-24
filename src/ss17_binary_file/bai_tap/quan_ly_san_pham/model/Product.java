package ss17_binary_file.bai_tap.quan_ly_san_pham.model;

public class Product implements java.io.Serializable {
    private int id;
    private String name;
    private double price;
    private String commodity;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, double price, String commodity, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.commodity = commodity;
        this.describe = describe;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", commodity='" + commodity + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
