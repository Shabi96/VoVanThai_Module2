package case_study.model.booking;

public class Booking {
    private String idBooking;
    private String dayBooking;
    private String dayStart;
    private String dayEnd;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, String dayBooking, String dayStart, String dayEnd, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", dayBooking='" + dayBooking + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer=" + idCustomer +
                ", idService=" + idService +
                '}';
    }

    public String writeToFile() {
        return idBooking + "," +
                dayBooking + "," +
                dayStart + "," +
                dayEnd + "," +
                idCustomer + "," +
                idService;
    }
}
