package inheritancePrograms;

public class MethodsAndVariablesAccessOfSuperClass {
    public static void main(String[] args) {
        System.out.println(A1.k);
        System.out.println(B2.k);
        System.out.println(new A1().j);
        System.out.println(new B2().j);



        D.walk();

    }
}

class A1{
    public static int k = 12;
    public int j = 10;
}

class B2 extends A1{
    public static int k = 13;
}


// if super class and subclass have same static variable, then accessing it from
// subclass will hide the superclass static variable.
// means you get subclass variable value.

// if superclass and subclass have same nonstatic variable, then accessing it from subclass will hide the superclass
// non-static variable.
// means you get subclass variable value.

class C{
    public static void walk(){
        System.out.println("C is walking..!!");
    }

    public void run(){
        System.out.println("C is running___");
    }
}

class D extends C{

    public void run(){
        System.out.println("D is running___");
    }
}

// if superclass and subclass have same static method, then accessing it from
// subclass will hide the superclass static method.
// means you get subclass method implementation.
// this process is called method hiding but not method overriding.

// if superclass and subclass have same non-static method, then accessing it from
// subclass will override the superclass non-static method.
// means you get subclass method overriding.

//method overriding is possible only when
//        1) inheritance
//        2) non-static methods
//

//we cannot override variables, we can perform only ew-initialization.
//        overriding means changing implementation of a method, so it is not applicable for variables.


//                            FINAL

//if we declare the variable as final we cannot re-initialize it
//if we declare the method as final we cannot override it
//if we declare the class as final we cannot inherit it .




