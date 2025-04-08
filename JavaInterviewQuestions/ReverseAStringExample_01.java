package JavaInterviewQuestions;

public class ReverseAStringExample_01 {
    public static void main(String[] args) {
        String s1 ="abcdefgh";
        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            s2  = s2 + s1.charAt(i);
        }
        System.out.println(" input :-> " + s1 );
        System.out.println("reverse:-> " + s2);
        if (s1 == s2)
        {
            System.out.println("String is Palindrome");

        }
        else{
            System.out.println("String is not palindrome");
        }

    }

}
