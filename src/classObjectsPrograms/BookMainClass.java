package classObjectsPrograms;

public class BookMainClass {
    public static void main(String[] args) {
        System.out.println();
        Book b1 = new Book("fire and ice","samar",1299.99);
        b1.issueBook();
        b1.turnCurrentPage();
        b1.bookMarkPage();
        b1.returnBook();
    }
}


class Book{
    public String name;
    public String author;
    public double price;

    public Book (String name,String author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

     public void issueBook(){
         System.out.println("Congratulations "+name+" has been issued to you!");

     }

     public void returnBook(){
         System.out.println("Thank you"+name+"has been collected");
         System.out.println();
     }

     public void turnCurrentPage(){
         System.out.println("Current page is turned");
     }

     public void bookMarkPage(){
         System.out.println("This page is book marked!");

     }
}
