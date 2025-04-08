package OOPS_Concepts.Polymorphism_4.Overridding;

//Method overriding happens when a subclass provides a specific implementation of a method
// that is already defined in its superclass.

// Key Takeaway:
//Overloading = same method name, different parameters (same class).
//
//Overriding = same method name + same parameters, but in subclass.


//🔧 super with Method Overriding
//In method overriding, if the subclass overrides a method, but still wants to call the original method from the superclass,
// it can use super.methodName().

public class Dog extends Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();  // Output: Animal makes a sound
        System.out.println( "---------------");

        Dog d = new Dog();
        d.makeSound();// Output: Dog barks
        System.out.println( "---------------");

        Animal ad = new Dog();
        ad.makeSound(); // Output: Dog barks (runtime polymorphism)
        System.out.println( "---------------");

        System.out.println( "##################################");

        Animal a1 = new Animal();
        a1.makeSound1();  // Output: Animal makes a sound
        System.out.println( "---------------");

        Dog d1 = new Dog();
        d1.makeSound1();// Output: Dog barks
        System.out.println( "---------------");

        Animal ad1 = new Dog();
        ad1.makeSound1(); // Output: Dog barks (runtime polymorphism)
        System.out.println( "---------------");

    }

// Super keyword,In method overriding, if the subclass overrides a method,
// but still wants to call the original method from the superclass, it can use super.methodName().
    void makeSound1() {
        super.makeSound(); // Call the superclass version
        System.out.println("Dog barks - child class"); // Add subclass-specific behavior
    }
    @Override
    void makeSound() {
        System.out.println("Dog barks - child class"); // Add subclass-specific behavior
    }
}
    //Super in constructor
//✅ Rules:
//super() must be the first line in the subclass constructor.
//You can use super(parameters) to call a specific constructor of the parent.
//

//class Animal {
//    String name;
//
//    // Constructor in parent class
//    Animal(String name) {
//        this.name = name;
//        System.out.println("Animal constructor called. Name: " + name);
//    }
//}

//class Dog extends Animal {
//    String breed;
//
//    // Constructor in subclass
//    Dog(String name, String breed) {
//        super(name); // Call parent class constructor - used for intiliasing the varible
//        this.breed = breed;
//        System.out.println("Dog constructor called. Breed: " + breed);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog("Buddy", "Golden Retriever");
//    }
//}

//🖨️ Output:
//Animal constructor called. Name: Buddy
//Dog constructor called. Breed: Golden Retriever

//💡 Why use super() in constructors?
//To initialize variables declared in the superclass.
//To reuse constructor logic from the parent class and avoid duplication.
