package classObjectsPrograms;

public class PizzaMainClass {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("cheeze Pizza", 399, "medium", "girija Nikunj, rudrapur, 263153, 9027580802");
        p1.orderPizza();
        p1.eatPieces(3);
        p1.parcel();
        p1.orderDetails();

        Pizza p2 = new Pizza("Farm house Pizza",899,"large","twin tower, rudrapur, 263153, 8445802340"); // REMOVE or create a default constructor
        p2.orderPizza();
        p2.eatPieces(5);
        p2.parcel();
        p2.orderDetails();

    }
}

class Pizza {
    public static String brand = "Dominoes";
    public int pieces = 8;
    public String name;
    public double price;
    public String size;
    public String address;

    public Pizza(String name, double price, String size, String address) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.address = address;
    }

    public void orderPizza() {
        System.out.println("your " + name + " order is placed");
        System.out.println("please wait while your order is being prepared");
        System.out.println();
    }

    public void eatPieces(int n) {
        pieces = pieces - n;
        System.out.println("you ate " + n + " pieces and you are left with " + pieces + " pieces");
        System.out.println();
    }

    public void parcel() {
        System.out.println("Your order is on the way!");
        System.out.println("Location: " + address);
        System.out.println();
    }

    public void orderDetails() {
        System.out.println("name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Number of pieces left: " + pieces);
        System.out.println("Price: " + price);
        System.out.println("Address: " + address);
        System.out.println();
    }
}
