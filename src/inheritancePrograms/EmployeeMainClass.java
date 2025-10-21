package inheritancePrograms;

public class EmployeeMainClass {
    public static void main(String[] args) {

        Salesperson s1 = new Salesperson("Alex","A24SPE001",30000,40000,15);
        SupportStaff st1 = new SupportStaff("Amanda","A24STA001",12000,"Morning",25);

        System.out.println("------------------ Sales Person ------------------");
        s1.increment(15);
        s1.leave(3);
        s1.makeSale(60000);
        s1.calculateCommission();

        System.out.println();

        System.out.println("------------------ Support Staff ------------------");
        st1.handleTicket();
        st1.report();
        st1.handleTicket();


    }
}

class Employeee{
    public String name;
    public String id;
    public double salary;

    public Employeee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void increment(double percentage){
        salary=salary+(salary*(percentage/100));
        System.out.println("Your salary has been incremented by "+percentage+" percentage");
        System.out.println("Final Salary : "+salary);
    }

    public void leave(int days){
        System.out.println("You have been granted the leave for "+days+" days");
    }

    public void workStatus(){
        System.out.println("E-mail the HR your work status!");
    }
}

class Salesperson extends Employeee{
    public double totalSales;
    public double commissionRate;

    public Salesperson(String name, String id, double salary, double totalSales, double commissionRate){
        this.totalSales=totalSales;
        this.commissionRate=commissionRate;

        super(name,id,salary);
    }

    public void makeSale(double amount){
        totalSales+=amount;
        System.out.println("Your credits have been recorded for the amount of sales you made today!");
    }

    public void calculateCommission(){
        double commission = (totalSales*(commissionRate/100));
        System.out.println("You made "+commission+" rs in commission !");
    }
}

class SupportStaff extends Employeee{
    public String shift;
    public int ticketHandled ;

    public SupportStaff(String name, String id, double salary, String shift, int ticketHandled){
        this.shift=shift;
        this.ticketHandled = 0;

        super(name,id,salary);
    }

    public void handleTicket(){
        ticketHandled++;
        System.out.println(name+" handled a ticket. Total tickets : "+ticketHandled);
    }

    public void report() {
        System.out.println(name + " (Support Staff) worked on " + ticketHandled + " tickets in the " + shift + " shift.");
    }
}
