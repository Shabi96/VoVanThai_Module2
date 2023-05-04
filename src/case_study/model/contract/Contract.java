package case_study.model.contract;

public class Contract {
    private int idContract;
    private int idBooking;
    private double deposit;
    private double sumMoney;

    public Contract() {
    }

    public Contract(int idContract, int idBooking, double deposit, double sumMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.sumMoney = sumMoney;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
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
}
