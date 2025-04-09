package JavaInterviewQuestions.Arrays;

// Array - An array is a container that holds
// multiple values of the same data type in a single variable.
public class Single_Dimensional_Array_Demo {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        int b[] = {7, 6, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println("#######");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
//🔸 1. Declare and Initialize Later
//int[] numbers;         // Declaration
//numbers = new int[5];  // Initialization (size 5)
//This creates an array of size 5 with default values (0 for int).

//🔸 2. Declare and Initialize Together (with size only)
//int[] numbers = new int[3];
//This creates: [0, 0, 0]

//🔸 3. Declare and Initialize with Values
//int[] numbers = {10, 20, 30};
//This creates: [10, 20, 30]
//You don’t need to specify the size when providing values directly.

//🔸 4. Using new with values
//int[] numbers = new int[] {1, 2, 3, 4};
//This is useful when you're not declaring and initializing on the same line.

//🔸 Other types of arrays:
//String[] names = {"Alice", "Bob", "Charlie"};
//double[] prices = new double[4];
//boolean[] flags = {true, false, true};