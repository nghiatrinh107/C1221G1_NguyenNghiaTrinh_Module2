package models;

public class Booking {
    private int idBooking;
    private String startDay,enđay;
    private int idCustomer;
    private String service;
    private String kindOfService;

    public Booking() {
    }

    public Booking(int idBooking, String startDay, String enđay, int idCustomer, String service, String kindOfService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.enđay = enđay;
        this.idCustomer = idCustomer;
        this.service = service;
        this.kindOfService = kindOfService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEnđay() {
        return enđay;
    }

    public void setEnđay(String enđay) {
        this.enđay = enđay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getKindOfService() {
        return kindOfService;
    }

    public void setKindOfService(String kindOfService) {
        this.kindOfService = kindOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", enđay='" + enđay + '\'' +
                ", idCustomer=" + idCustomer +
                ", service='" + service + '\'' +
                ", kindOfService='" + kindOfService + '\'' +
                '}';
    }
}

