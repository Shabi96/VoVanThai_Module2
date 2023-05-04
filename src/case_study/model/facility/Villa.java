package case_study.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int floors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String id, String name, double area, double price, int amount, String time, String roomStandard, double poolArea, int floors) {
        super(id, name, area, price, amount, time);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", price=" + getPrice() +
                ", amount=" + getAmount() +
                ", time='" + getTime() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                '}';
    }
    public String writeToFile() {
        return getId() +
                "," + getName() +
                "," + getArea() +
                "," + getPrice() +
                "," + getAmount() +
                "," +getTime() +
                "," + roomStandard +
                "," + poolArea +
                "," + floors;
    }
}
