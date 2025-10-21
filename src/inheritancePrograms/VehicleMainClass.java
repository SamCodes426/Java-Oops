package inheritancePrograms;

public class VehicleMainClass {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota","Hyryder",2018,3000000,4,"Petrol",false);
        Motorcycle m1 = new Motorcycle("Royal Enfield", "GT Continental", 2022, 450000,false, "2.4");

        System.out.println("------------------- "+ c1.model +" -----------------");
        c1.drive();
        c1.openRoof();
        System.out.println();
        c1.displayDetails();

        System.out.println("------------------- "+ m1.model +" -----------------");
        m1.doWheelie();
        m1.popWheelie();
        System.out.println();
        m1.displayDetails();
    }
}

class Vehicle{
    public String brand;
    public String model;
    public int year;
    public double price;

    public Vehicle(String brand, String model, int year, double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public void start(){
        System.out.println("The vehicle has been started! ");
    }

    public void stop(){
        System.out.println("The vehicle has been stoppped! ");
    }

    public void displayDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(price);
    }
}

class Car extends Vehicle{
    public int numDoors;
    public String fuelType;
    public boolean isConvertible;

    public Car(String brand,String model, int year, double price,int numDoors, String fuelType, boolean isConvertible){
        this.numDoors=numDoors;
        this.fuelType=fuelType;
        this.isConvertible=isConvertible;

        super(brand,model,year,price);
    }

    public void openRoof(){
        System.out.println("The roof is opened");
    }

    public void drive(){
        System.out.println("I'll start the car for you so that you can drive");
    }
}


class Motorcycle extends Vehicle{
    public boolean hasSideCar;
    public String engineCapacity;

    public Motorcycle(String brand, String model, int year, double price, boolean hasSideCar, String engineCapacity){
        this.engineCapacity=engineCapacity;
        this.hasSideCar=hasSideCar;

        super(brand,model,year,price);
    }

    public void doWheelie(){
        System.out.println("The front tire is in the air! ");
    }

    public void popWheelie(){
        System.out.println("The wheelie has been popped! ");
    }


}