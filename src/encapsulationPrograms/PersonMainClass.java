package encapsulationPrograms;

public class PersonMainClass {
    public static void main(String[] args) {
        Person p = new Person("Aniket",13,"Jaipur");
        System.out.println("Name : "+p.getName());
//        p.setName("Ankit");

    }
}

class Person{
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }


}

