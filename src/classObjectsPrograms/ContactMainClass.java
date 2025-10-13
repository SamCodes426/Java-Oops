package classObjectsPrograms;
//import java.util.Scanner;
public class ContactMainClass {
    public static void main(String[] args) {
        Contact p1 = new Contact("Tanishq Maurya","8445802340");
        p1.call();
        p1.message();
        p1.rename("Tanu");
        System.out.println(p1.name);

        Contact p2 = new Contact("Suraj Tiwari","9775566234");
        p2.call();
        p2.message();
        p2.rename("Suraj Kumar Tiwari");
        System.out.println(p2.name);
    }

}

class Contact{
    public String name;
    public String number;

    public Contact(String name,String number){
        this.name = name;
        this.number = number;
    }

    public void call(){
        System.out.println(number+" is ringing");
    }

    public void message(){
        System.out.println("message sent to "+name);
    }

    public void rename(String renamed){
//        Scanner sc = new Scanner(System.in);
//        String renamed = sc.nextLine();
        name = renamed;
        System.out.println("Name has been renamed to "+renamed);
    }
}
