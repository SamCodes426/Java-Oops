package inheritancePrograms;

public class AnimalMainClass {
    public static void main(String[] args) {

        Dog d1 = new Dog("Sheru","street dog",6,23.00,true);
        Cat c1 = new Cat("ornc",3,5,"orange",true);

        System.out.println("------------ Dog Info ------------");
        d1.eat();
        d1.sleep();
        d1.makeSound();
        d1.bark();
        d1.fetch();

        System.out.println();

        System.out.println("------------ Cat Info ------------");
        c1.eat();
        c1.sleep();
        c1.makeSound();
        c1.meow();
        c1.scratch();

    }
}

class Animal{
    public String name;
    public int age;
    public double weight;

    public Animal(String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public void eat(){
        System.out.println(name+" is eating!");
    }

    public void sleep(){
        System.out.println(name+" is sleeping!");
    }

    public void makeSound(){
        System.out.println(name+" is making this sound!");
    }
}

class Dog extends Animal{
    public String breed;
    public boolean isTrained;

    public Dog(String name,String breed, int age, double weight, boolean isTrained){
        this.breed=breed;
        this.isTrained=isTrained;

        super(name,age,weight);
    }

    @Override
    public void makeSound(){
        System.out.println(name+" says: Woof Woof !");
    }

    public void bark(){
        System.out.println("The dog is barking!!!");
    }

    public void fetch(){
        System.out.println(name+" go fetch this stick!");
    }
}

class Cat extends Animal{
    public String color;
    public boolean isIndoor;

    public Cat(String name, int age, double weight, String color, boolean isIndoor){
        this.color=color;
        this.isIndoor=isIndoor;

        super(name,age,weight);
    }

    @Override
    public void makeSound(){
        System.out.println(name+" says: Meow !");
    }
    public void meow(){
        System.out.println(name+" is meowing!!!");
    }

    public void scratch(){
        System.out.println("Scratch "+name);
    }
}