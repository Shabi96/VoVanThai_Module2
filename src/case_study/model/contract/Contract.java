package case_study.model.contract;

public class Contract {
    private String idContract;
    private String idBooking;
    private double deposit;
    private double sumMoney;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double deposit, double sumMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.sumMoney = sumMoney;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", sumMoney=" + sumMoney +
                '}';
    }
    public String writeToFile() {
        return idContract + "," + idBooking + "," + deposit + "," + sumMoney;
    }
}
