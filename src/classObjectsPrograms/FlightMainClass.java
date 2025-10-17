package classObjectsPrograms;

public class FlightMainClass {
    public static void main(String[] args) {
        Flight f1 = new Flight("A380", "Vistara", "delhi", "hawai", 79000, "1 Day 19 hours");
        f1.bookSeat();
        f1.displayFlightInfo();
    }
}

class Flight{
    public String flightNumber;
    public String airline;
    public String source;
    public String destination;
    public double price;
    public String duration;
    public boolean haveSeat;

    public Flight(String flightNumber, String airline, String source, String destination, double price, String duration){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.duration = duration;
    }

    public void bookSeat(){
        haveSeat = true;
        System.out.println("your seat has been booked");
    }

    public void cancelSeat(){
        haveSeat = false;
        System.out.println("your seat has been cancelled");
    }

    public void displayFlightInfo(){
        System.out.println("Flight Number : "+flightNumber);
        System.out.println("Airline : "+airline);
        System.out.println("going from : "+source);
        System.out.println("going to : "+destination);
        System.out.println("Price : "+price);
        System.out.println("Duration : "+duration);
        System.out.println("Seat booking status: "+haveSeat);
    }
}
