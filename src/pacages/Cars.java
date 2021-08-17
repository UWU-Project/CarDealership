package pacages;

public class Cars {

    String make;
    String model;
    int year;
    double mileage;
    double price;

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
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return "Make: "+getMake()+ " Model: "+getModel()+ " Year: "+getYear() + " Mileage: "+getMileage() + " Price: "+getPrice();
    }


}