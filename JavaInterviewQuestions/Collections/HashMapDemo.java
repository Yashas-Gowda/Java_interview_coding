package JavaInterviewQuestions.Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Map will be stored in (Key,Value) pair
        // Value is stored in the index

        // Very imp question in interview : DIff between HashMap and HashTable
// HashMap is non-synchronised( multiple threads can access at a time) -> Not Thread safe -> Allows null keys & Values -> iterated by Iterator
// HashTable is synchronised( multiple threads can not access at a time) -> Thread safe -> Not Allows null keys & values -> iterated by enumerator

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"AAA");
        System.out.println(hm);
        hm.put(2,"BBB");
        System.out.println(hm);
        hm.put(3,"CCC");
        System.out.println(hm);
        hm.put(4,"DDD");
        System.out.println(hm);
        hm.put(5,"EEE");
        System.out.println(hm);
        hm.remove(5);
        System.out.println(hm);
        Set ConvertedSet = hm.entrySet(); // entryset method converts Map into set
        System.out.println(hm);

        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"AAA");
        System.out.println(ht);
        ht.put(2,"BBB");
        System.out.println(ht);
        ht.put(3,"CCC");
        System.out.println(ht);
        ht.remove(5);
        System.out.println(ht);
        Set ConvertedSet1 = ht.entrySet(); // entryset method converts Map into set
        System.out.println(ht);

         Iterator it = ConvertedSet.iterator();
         while (it.hasNext())
         {
             System.out.println(it); // Values are stored in (key,Value) pairs in set. so we cant print it
             Map.Entry mp =(Map.Entry)it.next(); // we are converting the set values into map
             System.out.println(mp.getKey());
             System.out.println(mp.getValue());

         }




    }
}
