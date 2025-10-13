package contactsProgram;

public class Contacts_MainClass{
    public static void main() {
        Contact f1 = new Contact();
        Contact f2 = new Contact();
        Contact f3 = new Contact();
        Contact f4 = new Contact();

        f1.name = "Samarpit Maurya";
        f1.contactNumber = "9027580802";
        f1.bloodGroup = "b+ve";

        f2.name = "Nakul Thakur";
        f2.contactNumber = "9890336989";
        f2.bloodGroup = "ab+ve";

        f3.name = "Suraj Tiwari";
        f3.contactNumber="9557447374";
        f3.bloodGroup = "o+ve";

        System.out.println("Name: "+f1.name);
        System.out.println("Name: "+f2.name);
        System.out.println("Name: "+f3.name);
    }
}
class Contact{
    public String name;
    public String contactNumber;
    public static String nationality = "Indian";
    public String bloodGroup;

}