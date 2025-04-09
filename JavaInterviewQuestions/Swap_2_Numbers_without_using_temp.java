package JavaInterviewQuestions;

public class Swap_2_Numbers_without_using_temp {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a and b before swapping : " + a + "," + b);

        a = a + b ; // 9
        b = a - b ; // 4
        a = a - b ; // 5
        System.out.println("a and b after swapping : " + a + "," + b);
    }
}
