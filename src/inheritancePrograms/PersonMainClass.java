package inheritancePrograms;

public class PersonMainClass {
    public static void main(String[] args) {
        Student s = new Student("s24cseu0452", "Samarpit", 20, "male", "Btech CSE","A");
        Teacher t = new Teacher("Simran", 25,"female","Linux and shell Programming",60000,7);
        s.study(6);
        s.attendClass();
        s.getInfo();

        t.evaluateStudent(s);
    }
}


class Person{
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.println("This person is eating!");
    }

    public void sleep(int hours){
        System.out.println("this person has been sleeping for "+hours+" hours");
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}

class Student extends Person{
    public String studentId;
    public String course;
    public String grade;

    public Student(String studentId,String name,int age,String gender, String course, String grade){
        this.studentId=studentId;
        this.course=course;
        this.grade=grade;
        super(name,age,gender);
    }

    public void study(int hours){
        System.out.println("This student has been studying from"+hours+" hours");
    }

    public void attendClass(){
        System.out.println("This class has been attended");
    }
}

class Teacher extends Person {
    public String subject;
    public double salary;
    public int yearsOfExperience;

    public Teacher(String name, int age, String gender, String subject, double salary, int yearsOfExperience){
        this.subject=subject;
        this.salary=salary;
        this.yearsOfExperience=yearsOfExperience;

        super(name,age,gender);

    }

    public void teachClass(){
        System.out.println("You have to teach this class");
    }

    public void evaluateStudent(Student s){
        System.out.println(s.name+" has been Evaluated");
    }
}


