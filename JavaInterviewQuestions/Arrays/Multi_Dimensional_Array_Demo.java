package JavaInterviewQuestions.Arrays;

public class Multi_Dimensional_Array_Demo {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 3;
        a[0][2] = 5;
        a[1][0] = 1;
        a[1][1] = 3;
        a[1][2] = 5;
        int b[][] = {{1,2,5},{7, 6, 5}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");

        }
        System.out.println("######################");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
