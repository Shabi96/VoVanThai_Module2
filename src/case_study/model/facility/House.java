package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House() {
    }

    public House(String roomStandard, int floors) {
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public House(String id, String name, double area, double price, int amount, String time, String roomStandard, int floors) {
        super(id, name, area, price, amount, time);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", area=" + getArea() +
                ", price=" + getPrice() +
                ", amount=" + getAmount() +
                ", time='" + getTime() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
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
                "," + floors;
    }
}
