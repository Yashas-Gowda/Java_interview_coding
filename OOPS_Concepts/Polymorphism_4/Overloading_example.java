package OOPS_Concepts.Polymorphism_4;
//Method Overloading?
//Method overloading means defining multiple methods with the same name in the same class,
// but with different parameters (number, type, or both).
public class Overloading_example {
    public static void main(String[] args) {
        Overloading_example ov = new Overloading_example();
        ov.getData(1); // same method name
        ov.getData(1,2); // diff arguments
        ov.getData("Yashas"); // diff dataType
        ov.getData("Yashas",25); // diff both arguments,dataType

    }
//    Overloading_example - number
    public void getData(int a)
    {
        System.out.println(a);
    }
    public void getData(int a,int b)
    {
        System.out.println(a + " " +b);
    }
    public void getData(String a)
    {
        System.out.println(a);
    }
    public void getData(String c,int d)
    {
        System.out.println(c + " "+ d);
    }
}
