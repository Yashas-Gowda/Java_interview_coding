package JavaInterviewQuestions;

public class StringSwapExample_02 {
    public static void main(String[] args) {
        String s1 = "Yashas";
        String s2 = "Gowda";
        s1 = s1 + s2 ; //        s1--> YashasGowda
        s2 = s1.substring(0, s1.length()-s2.length()); // s2-> Yashas
        s1 = s1.substring(s2.length()); //s1 = Gowda
        System.out.println("s1:->"+s1);
        System.out.println("s2:->"+s2);

        // Strings are immutable

        //So we have mutable string 2 class - StringBuffer and StringBuilder
//        StringBuffer is synchronous ( one task after other), so it is thread safe. --> slow execution
//        StringBuilder is Asynchronous ( multiple can access at a time), so not thread safe --> fast execution
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("sb ="+sb);
        sb.append("World"); //helloWorld
        System.out.println("sb.append(\"World\"); = " + sb);
        sb.insert(0,"Hey,"); // Hey,helloWorld
        System.out.println(" sb.insert(0,\"Hey,\");  = " + sb);
        sb.replace(0,2,"Hi"); //Hi,helloWorld
        System.out.println("sb.replace(0,2,\"Hi\"); = " + sb);
        sb.delete(2,3); // HihelloWorld
        System.out.println("       sb.delete(2,3);  = " + sb);
        sb.reverse();
        System.out.println("sb.reverse(); = " + sb); //dlroWollehiH
    }
}
