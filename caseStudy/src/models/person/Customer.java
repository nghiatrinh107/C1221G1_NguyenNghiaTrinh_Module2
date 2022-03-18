package models.person;

public class Customer extends Person {
    private String membership;
    private String address;

    public Customer() {
    }

    public Customer(int id, String fullName, String birthday, String gender, int identityCard, String email, String phone, String membership, String address) {
        super(id, fullName, birthday, gender, identityCard, email, phone);
        this.membership = membership;
        this.address = address;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{ " + super.toString() +
                ", membership= " + membership +
                ", address= " + address +
                "} ";
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + membership + "," + address;
    }
}
