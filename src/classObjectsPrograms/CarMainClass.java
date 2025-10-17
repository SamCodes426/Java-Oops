package classObjectsPrograms;

public class CarMainClass {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M5 Competetion", 2018,"metal gray", 210);
        c1.accelerate(20);
        c1.brake(100);
        c1.displayStatus();
    }
}

class Car{
    public String make;
    public String model;
    public int year;
    public String color;
    public int speed;

    public Car(String make, String model, int year, String color, int speed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public void accelerate(int increment){
        speed = speed+increment;
        System.out.println("Your speed is: "+speed);
    }

    public void brake(int decrement){
        if (speed <=0 || speed < decrement){
            speed = 0;
        }
        else {
            speed = speed - decrement;
        }
        System.out.println("Your speed is: "+speed);
    }

    public void displayStatus(){
        System.out.println("Brand : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Color : "+color);
        System.out.println("Speed : "+speed);
    }

}
