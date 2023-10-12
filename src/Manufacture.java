public class Manufacture {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registrationNumber;

    public Manufacture(int id, String make, String model, int year, String color, int price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return this.id + " " + this.make + " " + this.model + " " + this.year + " " + this.color + " " + this.price + " " + this.registrationNumber;
    }
}
