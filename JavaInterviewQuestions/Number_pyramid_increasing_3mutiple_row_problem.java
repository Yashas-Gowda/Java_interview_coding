package JavaInterviewQuestions;

public class Number_pyramid_increasing_3mutiple_row_problem {
    public static void main(String[] args) {
       int k =1 ;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k*3);
                k++;
                System.out.print("\t");

            }
            System.out.println("");

        }
    }
}

//3
//6 9
//12 15 18
//21 24 27 30