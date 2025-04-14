package JavaInterviewQuestions.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
// HashSet, TreeSet, LinkedHashSet implements set interface
        //Sets doesn't accept duplicate values
        //There no guarantee elements stored in sequential order.. can be stored Randomly
        HashSet<String> hs = new HashSet<String>();
        hs.add("Yashas");
        System.out.println(hs);
        hs.add("Ram");
        System.out.println(hs);
        hs.add("Ram");
        System.out.println(hs);
        hs.add("Laksman");
        System.out.println(hs);
        hs.add("Raja");
        System.out.println(hs);
        hs.remove("Raja");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove("Ram"));
        System.out.println(hs);
        hs.add("AAA");
        hs.add("BBB");
        hs.add("CCC");
        System.out.println(hs);

        //Iterator - it is used to traverse the sets , first i.next() comes to zero index
        Iterator<String> i = hs.iterator();
        // First time
        System.out.println(hs.size());
        System.out.println(i.next());
        System.out.println(i.next());
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
