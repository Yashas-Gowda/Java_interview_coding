package JavaInterviewQuestions;

public class Swap_2_Numbers_using_temp {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a and b before swapping :" + a + "," + b);
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("a and b after swapping :" + a + "," + b);

    }
}
