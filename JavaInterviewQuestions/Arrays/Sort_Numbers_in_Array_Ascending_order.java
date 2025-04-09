package JavaInterviewQuestions.Arrays;

public class Sort_Numbers_in_Array_Ascending_order {
    public static void main(String[] args) {


// step 1:  from left -> compare each number with all other remaining element, place min element in left side
// step 2:  Repeat step1 for remaining elements till last.
// note: here we are comparing 2 different elements in diff position so we need 2 for loop

        int a[] = {2,4,5,3,6,9,8,1};
        int temp = 0;
        System.out.print("Array before Sorting :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length ; j++) {
                if (a[i]>a[j]){ // In Accending, a[i]<a[j], so if it is opposite swap.
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp ;
                }
            }
        }
        System.out.println("");
        System.out.println("###################");
        System.out.print("Array After Sorting :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
