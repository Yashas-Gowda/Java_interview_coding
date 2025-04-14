package OOPS_Concepts.Others;

public class ConstructorDemo {

    //A constructor in Java is a special method used to initialize objects.
    // It has the same name as the class and doesn't have a return type, not even void.

    //✅ Key Points:
//constructor -> Called automatically when you create an object.
//
//Can be default (no parameters) or parameterized (takes arguments).
//
//You can have multiple constructors (Constructor Overloading).
   //default constructor
    public ConstructorDemo(){
        System.out.println("I am in the default Constructor without parameter");
    }

    public ConstructorDemo(int a, int b){
        int c = a + b ;
        System.out.println("I am the Int parameterized Constructor : "+c);
    }

    public ConstructorDemo(String str){
        System.out.println("I am in string parameterized constructor : " + str);
    }



    public void getData(){
        System.out.println("I am the Methode");
    }
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cd_string = new ConstructorDemo("Yashas");
        ConstructorDemo cd_parameterised = new ConstructorDemo(4,5);


    }
}
