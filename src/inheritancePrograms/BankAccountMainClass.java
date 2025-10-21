package inheritancePrograms;

public class BankAccountMainClass {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(87684138,"Conor McGregor", 5000000,8);
        CurrentAccount c1 = new CurrentAccount(45745364,"Alex pierera", 2500000, 100000);

        System.out.println(s1.accountHolderName);
        s1.deposit(500000);
        s1.addInterest();
        s1.withdraw(100000);
        s1.displayBalance();

        System.out.println();

        System.out.println(c1.accountHolderName);
        c1.deposit(3000000);
        c1.checkOverDraftLimit();
        c1.displayBalance();

    }
}

class BankAccount{
    public long accountNumber;
    public String accountHolderName;
    public double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance = balance+amount;
        System.out.println(amount+" has been deposited to your account with account number "+accountNumber);
    }

    public void withdraw(double amount){
        balance=balance-amount;
    System.out.println(amount+" has been withdrawn!");
    }

    public void displayBalance(){
        System.out.println("The balance in your account is : "+ balance);
    }
}

class SavingsAccount extends BankAccount{
    public double interestRate;

    public SavingsAccount(long accountNumber, String accountHolderName, double balance, double interestRate){
        this.interestRate=interestRate;
        super(accountNumber,accountHolderName,balance);
    }

    public void addInterest(){
        balance= balance+(balance*(interestRate/100));
    }
}

class CurrentAccount extends BankAccount{
    public double overDraftLimit;

    public CurrentAccount(long accountNumber, String accountHolderName, double balance, double overDraftLimit){
        this.overDraftLimit=overDraftLimit;

        super(accountNumber,accountHolderName,balance);
    }

    public void checkOverDraftLimit(){
        System.out.println("The over draft limit is "+ overDraftLimit);
    }
}

