package classObjectsPrograms;

public class StudentMainClass {
    public static void main(String[] args) {
        Student s1 = new Student("S24cseu0452","Samarpit Maurya",20,"A","Linux and shell programming");
        s1.registerCourse("C++");
        System.out.println(s1.courseName);
        s1.dropCourse("C++");
        System.out.println(s1.courseName);
    }
}

class Student{
    public String studentId;
    public String name;
    public int age;
    public String grade;
    public String major;
    public String courseName;

    public Student(String studentID, String name, int age, String grade, String major){
        this.studentId = studentID;
        this.name = name;
        this.age= age;
        this.grade = grade;
        this.major = major;
    }

    public void registerCourse(String courseName){
        this.courseName = courseName;
        System.out.println("You have been registered in "+courseName);
    }

    public void dropCourse(String droppingCourse){
        if(droppingCourse.equals(courseName)){
            System.out.println("You have dropped "+courseName);
            courseName = null;
        }
        else{
            System.out.println("You have not registered for this course");
        }

    }

    public void showProfile(){

        System.out.println(studentId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(major);
        System.out.println(courseName);

    }
}