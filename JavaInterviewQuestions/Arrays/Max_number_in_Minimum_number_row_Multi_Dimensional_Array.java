package JavaInterviewQuestions.Arrays;

public class Max_number_in_Minimum_number_row_Multi_Dimensional_Array {
    public static void main(String[] args) {
        int abc[][]={{5,2,3},{1,26,6},{4,2,13}};
        int min =abc[0][0];
        int minRow = 0 ;
        int max =abc[0][0];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j] ;
                    minRow = i ;
                }
            }
        }
        System.out.println("Minimum number row is: " + minRow );
        int maximum_num_in_min_row = abc[minRow][0];
            for (int j = 0; j < 3; j++) {
                if (abc[minRow][j] > maximum_num_in_min_row) {
                    maximum_num_in_min_row = abc[minRow][j] ;
                }

        }

        System.out.println("################");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(abc[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("################");
        System.out.println("maximum number in minimum row Number in Array is : " + maximum_num_in_min_row);
    }
}
