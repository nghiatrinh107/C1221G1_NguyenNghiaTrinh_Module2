package bai_tap_them.models;

public class Manufacturer {
    private String code;
    private String manufacturer;
    private String national;

    public Manufacturer() {
    }

    public Manufacturer(String code, String manufacturer, String national) {
        this.code = code;
        this.manufacturer = manufacturer;
        this.national = national;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "code='" + code + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", national='" + national ;

    }
}
