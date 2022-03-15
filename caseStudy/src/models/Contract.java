package models;

public class Contract {
    private int contractCode;
    private int idBooking;
    private int deposit;
    private int payTheBill;
    private int idCustomer;

    public Contract() {
    }

    public Contract(int contractCode, int idBooking, int deposit, int payTheBill, int idCustomer) {
        this.contractCode = contractCode;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.payTheBill = payTheBill;
        this.idCustomer = idCustomer;
    }

    public int getContractCode() {
        return contractCode;
    }

    public void setContractCode(int contractCode) {
        this.contractCode = contractCode;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPayTheBill() {
        return payTheBill;
    }

    public void setPayTheBill(int payTheBill) {
        this.payTheBill = payTheBill;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode=" + contractCode +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", payTheBill=" + payTheBill +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
