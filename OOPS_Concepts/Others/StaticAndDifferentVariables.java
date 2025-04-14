package OOPS_Concepts.Others;

public class StaticAndDifferentVariables {
    String name; // local variable
    String address;// local variable
    int i = 0; // local variable

    static String city = "Bangalore";     // Instance / class variable
    static int j = 0;  // Instance / class variable
    static void getCity(){        // Static method
        System.out.println(city); // we can use only static variables inside the static method
       // System.out.println(address); // we cannot use local variables in statis method
    }

    // All the static variables can only be initialised in the Static block
//    static {
//        int j = 0;
//        String city = "Bangalore";
//    }


    //Constructor
    StaticAndDifferentVariables(String name, String address){
        this.name = name;
        this.address = address;
        i++; // local variable -> object scope -> it can be used by all objects separately
        System.out.println("Local Variable -> object scope -> i = "+ i);
        j++; // Instance/Class variable -> Class scope -> it can be used by all objects Commonly as shared variable
        System.out.println("Class/Instance Variable -> Class scope -> j = "+ j);

    }


    public void getDetails(){
        System.out.println(name + "," +address);

    }


    public static void main(String[] args) {
        StaticAndDifferentVariables obj = new StaticAndDifferentVariables("ram","Vijaynagar");
        StaticAndDifferentVariables obj1 = new StaticAndDifferentVariables("raj","Chandra layout");
        StaticAndDifferentVariables obj2 = new StaticAndDifferentVariables("king","Surya layout");
        // To call local variable -> object.methodName
        obj.getDetails();
        obj1.getDetails();
        obj2.getDetails();

        // To call Instance variable -> ClassName.methodName or ClassName.VariableName
        StaticAndDifferentVariables.getCity();
        System.out.println("Before initialisation of j : "+StaticAndDifferentVariables.j);
        StaticAndDifferentVariables.j = 20; // static variable can be initialized at run time
        System.out.println("After initialisation of j : "+StaticAndDifferentVariables.j);
        System.out.println("Before initialisation of obj2.address : "+obj2.address);
        obj2.address = "Surya form";
        System.out.println("After initialisation of obj2.address : "+obj2.address);
        obj2.getDetails();


    }
}
