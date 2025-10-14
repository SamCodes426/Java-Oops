package classObjectsPrograms;

public class BankAccountMainClass {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(765442432,"Samarpit Maurya", 100000, "Current");
        System.out.println(a1.balance);
        a1.deposit(34000);
        a1.withdraw(12000);
        System.out.println(a1.balance);
    }
}

class BankAccount{
    public long accountNumber;
    public String accountHolderName;
    public double balance;
    public String accountType;

    public BankAccount(long accountNumber, String accountHolderName, double balance, String accountType){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("You have deposited "+amount+"and your balance is "+balance);
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("insufficient funds");
        }
        else{
            balance = balance - amount;
        }
        System.out.println(amount+" withdrawn and your balance is: "+balance);
    }

    public void displayBalance(){
        System.out.println(balance);
    }
}

