package JavaInterviewQuestions.Arrays;

public class Max_number_in_Multi_Dimensional_Array {
    public static void main(String[] args) {
        int abc[][]={{5,2,3},{4,13,6},{1,2,9}};
        int max =abc[0][0];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] > max) {
                    max = abc[i][j] ;
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
        System.out.println("Minimum Number in Array is : " + max);
    }
}
