package JavaInterviewQuestions.Collections;

import java.util.ArrayList;

public class ArrayListDemo<S> {
    // can accept duplicate value
    //Array has fixed size, while ArrayList can grow dynamically
    //You can access and insert any value in any index
    public static void main(String[] args) {

       ArrayList<String> a = new ArrayList<String>();
       a.add("Yashas");
        System.out.println(a);
       a.add("Java");
        System.out.println(a);
       a.add("Student");
        System.out.println(a);
        a.add(0,"1st");
        System.out.println(a);
        a.remove("Student");
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add("Java");
        System.out.println(a);
        a.add("Student");
        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Yashas"));


    }
}
