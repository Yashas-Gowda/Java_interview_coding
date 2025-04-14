package OOPS_Concepts.Inheritence_3;

public class Super_ChildClass extends Super_ParentClass{



    // variable from Parent & Child class
    String name = "ChildClass";
    public void getStringData(){
        System.out.println("I am calling child variable : "+ name); // first priority is for variable in child class or local variable
        System.out.println("I am calling Parent variable : "+ super.name); // variable from Parent class
    }

    // Method from Parent & Child class
    public void getDataFromMethod(){
        super.getDataFromMethod();       // Method from Parent class is called, when super keyword used
        System.out.println("I am method in Child class");
    }

    // Constructor from Parent & Child class
    public Super_ChildClass(){
        // super();                  // Super keyword calls Parent class Constructor,but first word in child constructor should be Super.
        // super() is called automatically here
        System.out.println("Child  class constructor called");
    }
    //✅ Easy Rule:
    //super() must be the first line in the child constructor.
    //
    //If you don’t write super(),
    // Java adds it automatically only if the parent class has a default (no-argument) constructor.



    public static void main(String[] args) {
        Super_ChildClass child_object =  new Super_ChildClass();
        child_object.getStringData();

        child_object.getDataFromMethod();



    }
}
