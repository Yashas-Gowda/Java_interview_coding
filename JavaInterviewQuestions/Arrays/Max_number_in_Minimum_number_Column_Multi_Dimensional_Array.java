package JavaInterviewQuestions.Arrays;

public class Max_number_in_Minimum_number_Column_Multi_Dimensional_Array {
    public static void main(String[] args) {
        int abc[][]={{5,1,3},{2,26,6},{4,2,13}};
        int min =abc[0][0];
        int minColumn = 0 ;
        int max =abc[0][0];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j] ;
                    minColumn = j ;
                }
            }
        }
        System.out.println("Minimum number row is: " + minColumn );
        int maximum_num_in_min_Column = abc[0][minColumn];
            for (int i = 0; i < 3; i++) {
                if (abc[i][minColumn] > maximum_num_in_min_Column) {
                    maximum_num_in_min_Column = abc[i][minColumn] ;
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
        System.out.println("maximum number in minimum row Number in Array is : " + maximum_num_in_min_Column);
    }
}
