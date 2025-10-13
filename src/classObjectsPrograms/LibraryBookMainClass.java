package classObjectsPrograms;

public class LibraryBookMainClass {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Rich dad , poor dad","Robert T. Kiyosaki","978-0-439-02348-1","Warner Books",366.99);
        book1.issueBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();
    }
}

class LibraryBook{

    public String title;
    public String author;
    public String ISBN;
    public String publisher;
    public double price;
    public boolean isIssued;

    public LibraryBook(String title,String author,String ISBN,String publisher,double price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.price = price;
    }

    public void issueBook(){
        System.out.println(title+" has been issued! ");
        isIssued = true;
    }

    public void returnBook(){
        System.out.println(title+"has been returned");
        isIssued = false;
    }

    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Publisher: "+publisher);
        System.out.println("Price: "+price);
        System.out.println("isIssued: "+isIssued);
    }
}
