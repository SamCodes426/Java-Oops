package classObjectsPrograms;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderMainClass {
    public static void main(String[] args) {
        Order o1 = new Order(12367, "Samarpit Maurya", 0, "Pending");
        o1.addItem("samosa",30);
        o1.addItem("Rajma Chawal",299);
        o1.updateStatus("Preparing");
        o1.printInvoice();
    }
}

class Order{
    public int orderID;
    public String customerName;
//    public String orderDate;
    public double totalAmount;
    public String status;

    LocalDate currentDate = LocalDate.now();


    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    public Order(int orderID, String customerName, double totalAmount, String status){
        this.orderID = orderID;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void updateStatus(String newStatus){
        status = newStatus;
        System.out.println("Order status has been updated with "+newStatus);
    }

    public void addItem(String item , double price){
        items.add(item);
        prices.add(price);
        totalAmount +=price;
        System.out.println("you have successfully added "+item+"of price: "+price);
    }

    public void printInvoice(){

        System.out.println("------ INVOICE ------");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customerName);
        System.out.println("Order Date: " + currentDate);
        System.out.println("Status : " + status);
        System.out.println("---------------------");
        System.out.println("Items:");

        for (int i=0 ; i<items.size() ; i++){
            System.out.println((i + 1) + ". " + items.get(i) + " - ₹" + prices.get(i));
        }

        System.out.println("---------------------");
        System.out.println("Total: ₹" + totalAmount);
        System.out.println("---------------------");
        System.out.println("Thank you for your order!");
    }
}
