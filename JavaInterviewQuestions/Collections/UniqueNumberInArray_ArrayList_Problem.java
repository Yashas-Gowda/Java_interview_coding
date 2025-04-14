package JavaInterviewQuestions.Collections;

import java.util.ArrayList;

public class UniqueNumberInArray_ArrayList_Problem {
    public static void main(String[] args) {
        int a[] = {4,5,5,5,4,6,6,9,4};

//        step 1: scan every element of array using for loop
//        step 2: Push every unique element into array list,
//        then count if we found element again by increasing the value of k

        ArrayList<Integer> ab = new ArrayList<Integer>(); // ab is the array list
        for(int i =0 ; i< a.length ; i ++){
            int k =0;
            if(!ab.contains(a[i])) //if array element is not present in arraylist then enter loop
            {
                ab.add(a[i]);
                k++;
                for (int j = i+1; j < a.length ; j++) {
                    if(a[i] == a[j]){
                         k ++;
                    }
                }
                System.out.print("Number "+a[i]);
                System.out.println(" occured in Array " + k +" times");
                if(k==1){
                    System.out.println(a[i] +" is the unique Number in Array");
                }
            }

        }


    }
}
