package JavaInterviewQuestions;

import com.sun.security.jgss.GSSUtil;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello, Java!";
        String s1 = "Hello, Java!";

        String s2 = new String("Yashas");
        String s3 = new String("Yashas");

        System.out.println(s==s1); // Compares the object address
        System.out.println(s2.equals(s3)); //Compares only values without address


        System.out.println(s.length()); // --> lenth of the string
        System.out.println(s.charAt(7)); // charator at index 7
        System.out.println(s.equalsIgnoreCase( "hello, Java!")); // retuns true if equal

        System.out.println(s.indexOf('J')); //returns the index of the first occurrence of the specified substring within the string.
        System.out.println(s.indexOf("Java")); //If the substring is not found, it returns -1.
        System.out.println(s.replace("Java", "Python")); // replace string
        System.out.println(s.replace('J','M')); // replace old char with new char -> Mava
        System.out.println(s.substring(7,11)); // prints from substring from index 7 to 10 -> including 7 and excluding 11
        System.out.println(s.substring(7));//Prints from 7 index to last index
        System.out.println(s.concat("This is yashas"));
        System.out.println(s.trim());
        System.out.println(s.toLowerCase());
        System.out.println(s.toLowerCase());
        String arr[] = s.split(",");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

    }
}
