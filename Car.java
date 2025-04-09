public class Car {

    // private attributes(Encapsulation)
    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    
    // Constaructor to initalize car data
    public Car(String brand,String model,int year,double price,String fuelType){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
        this.fuelType=fuelType;
    }

    // getter method(read-only access)
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public String geStringType(){
        return fuelType;
    }

    // Setter methods(update value)
    public void setPrice(double price){
        this.price=price;
    }
    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }
    
    // Display method to print car deatils

    public void display(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Price : "+price);
        System.out.println("Fuel Type : "+fuelType);
        System.out.println("----------------------------");
    }
}
