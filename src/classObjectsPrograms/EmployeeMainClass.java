package classObjectsPrograms;

public class EmployeeMainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("1A", "Samarpit Mauya", "frontend", 60000, "s24frnt@sappbrk.com");
        e1.changeDepartment("backend");
        e1.raiseSalary(50);
        e1.showInfo();
    }
}

class Employee{
    public String empID;
    public String name;
    public String department;
    public double salary;
    public String email;

    public Employee(String empID, String name, String department, double salary, String email){
        this.empID = empID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
    }

    public void raiseSalary(double percentage){
        salary = salary+salary*(percentage/100);
        System.out.println("Your salary has been incresed by "+percentage+"% and now you will be paid "+salary+"per month");
    }

    public void changeDepartment(String newDept){
        department = newDept;
        System.out.println("your new department is "+newDept);
    }

    public void showInfo(){
        System.out.println(empID);
        System.out.println(name);
        System.out.println(department);
        System.out.println(salary);
        System.out.println(email);
    }
}
