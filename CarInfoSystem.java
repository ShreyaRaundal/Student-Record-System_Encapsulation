public class CarInfoSystem {
    public static void main(String[] args) {
        
        // creating car object using constructor
        Car c1=new Car("Toyota", "Innova Crysta",2022,2200000.0,"Diesel");
        Car c2=new Car("Tesla","Model 3",2024,5000000.0,"Electric");
        Car c3=new Car("Maruti Suzuki","Swift",2021,850000.0,"petrol");

        // Displaying car detail
        c1.display();
        c2.display();
        c3.display();

        // updating price and fuel type f a car
        c3.setPrice(80000.0);
        c3.setFuelType("CNG");

        // Rechecking updating car deatils
        System.out.println("Updated Details for "+c3.getBrand()+" "+c3.getModel()+":");
        c3.display();
    }
}
