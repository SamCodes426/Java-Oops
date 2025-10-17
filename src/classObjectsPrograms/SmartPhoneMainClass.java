package classObjectsPrograms;

public class SmartPhoneMainClass {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", "S24 ultra", 129000,256,98);
        s1.makeCall("8077788367");
        s1.installApp("Signal");
        s1.charge(30);


    }
}

class Smartphone{

    public String brand;
    public String model;
    public double price;
    public double storageCapacity;
    public double batteryLevel;

    public Smartphone(String brand, String model, double price, double storageCapacity, double batteryLevel){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storageCapacity = storageCapacity;
        this.batteryLevel = batteryLevel;
    }

    public void makeCall(String number){
        System.out.println("calling "+number);
    }

    public void installApp(String appName){
        System.out.println(appName+" has been installed");
    }

    public void charge(int minutes){
        System.out.println("you phone will be charged for "+minutes +" minutes");
    }
}
