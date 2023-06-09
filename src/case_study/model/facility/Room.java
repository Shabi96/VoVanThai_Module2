package case_study.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String name, double area, double price, int amount, String time, String freeService) {
        super(id, name, area, price, amount, time);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", price=" + getPrice() +
                ", amount=" + getAmount() +
                ", time='" + getTime() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String writeToFile() {
        return getId() +
                "," + getName() +
                "," + getArea() +
                "," + getPrice() +
                "," + getAmount() +
                "," +getTime() +
                "," + freeService;
    }
}
