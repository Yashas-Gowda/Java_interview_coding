package JavaInterviewQuestions.StreamsLambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhi");
        names.add("Don");
        names.add("Alekya");
        names.add("Adam");
        names.add("Ram");

        // Print names start with name A
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
      // Print names length greter then 4
        names.stream().filter(s -> s.length()>=4).forEach(s-> System.out.println(s));
        System.out.println("-----------");
        // limit only output
        names.stream().filter(s -> s.length()>=4).limit(1).forEach(s-> System.out.println(s));
        System.out.println("-----------");
        // Map will alter the original content
        // print names endswith "a" and then covert to uppercase
        Stream.of("Abhijeet","Don","Alekya","Adam","Rama").filter(s -> s.endsWith("a"))
                .map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("-----------");

        // Convert Array to list and sort array
        List<String> names1 = Arrays.asList("Abhijeet","Don","Alekya","Adam","Rama","Yashas");
        names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        System.out.println("-----------");
        // Contains of 2 streams and sort
        Stream<String> newStream = Stream.concat(names1.stream(),names.stream());
        newStream.sorted().forEach(s -> System.out.println(s));


        //Stream Collect -> collect(Collectors.toList());
        System.out.println("-----------");
        List<String> ls= Stream.of("Abhijeet","Don","Alekya","Adam","Rama").filter(s -> s.endsWith("a"))
                .map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls.get(0));

        // Array numbers -> find unique and sort
        System.out.println("-----------");
        List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
        values.stream().distinct().forEach(s-> System.out.print(" " + s + " "));
        // Sort and give third index
        System.out.println("-----------");
        List<Integer> values1 = Arrays.asList(3,2,2,7,5,1,9,7);
        List<Integer> li = values1.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(" ");
        System.out.println(li.get(2));

    }
}
