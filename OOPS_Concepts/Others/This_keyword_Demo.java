package OOPS_Concepts.Others;

public class This_keyword_Demo {

    int a = 2; // class level variable

    public void get(){
        int a =3 ; // block level variable
        System.out.println(a); // a =3
        System.out.println(this.a); // a = 2
        // this keyword refers to current object of Class, scope is class level
        int b = a + this.a ;
        System.out.println("sum = "+ b);
    }

    public static void main(String[] args) {
        This_keyword_Demo obj = new This_keyword_Demo();
        obj.get();
    }
}
