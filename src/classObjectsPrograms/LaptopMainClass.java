package classObjectsPrograms;

public class LaptopMainClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", "omen 16", "ryzen 7 7840", 32, 125000, false);
        l1.turnOn();
        l1.upgradeRam(32);
        l1.displaySpecs();
    }
}

class Laptop{
    public String brand;
    public String model;
    public String processor;
    public int ramSize;
    public double price;
    public boolean isOn;

    public Laptop(String brand, String model, String processor, int ramSize, double price, boolean isOn){
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.price = price;
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Laptop is switched ON ");
    }

    public  void turnOff(){
        isOn = false;
        System.out.println("Laptop is switched OFF ");
    }

    public void upgradeRam(int newRamSize){
        ramSize = newRamSize;
        System.out.println("RAM has been upgraded from "+ramSize+"to"+newRamSize);
    }

    public void displaySpecs(){
        System.out.println("-------------------");
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Processor: "+processor);
        System.out.println("RAM Size: "+ramSize);
        System.out.println("Price: "+price);
        System.out.println("Is Laptop on: "+isOn);
        System.out.println("--------------------");
    }
}
