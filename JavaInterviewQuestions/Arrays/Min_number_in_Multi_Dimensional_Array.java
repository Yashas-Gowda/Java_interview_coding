package JavaInterviewQuestions.Arrays;

public class Min_number_in_Multi_Dimensional_Array {
    public static void main(String[] args) {
        int abc[][]={{9,2,3},{4,3,6},{1,2,3}};
        int min =abc[0][0];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j] ;
                }
            }
        }
        System.out.println("################");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(abc[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("################");
        System.out.println("Minimum Number in Array is : " + min);
    }
}
