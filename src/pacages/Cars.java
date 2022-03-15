package pacages;
public class Cars {

    String make;
    String model;
    int year;
    String mileage;
    double price;

    public Cars() {
    }

    public Cars(String make, String model, int year, String mileage, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    // Setters and getters for the Cars member variables
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Make: " + getMake() + " Model: " + getModel() + " Year: " + getYear() + " Mileage: " + getMileage() + " Price: " + getPrice();
    }
}