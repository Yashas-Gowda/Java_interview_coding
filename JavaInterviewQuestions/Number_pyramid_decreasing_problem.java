package JavaInterviewQuestions;

public class Number_pyramid_decreasing_problem {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j<4-i ; j++) {
                System.out.print(k);
                System.out.print("\t");
                 k++;

            }
            System.out.println(" ");
        }
    }
}

//        1	2	3	4
//        5	6	7
//        8	9
//        10