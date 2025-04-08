package OOPS_Concepts.Inheritence_3;

public class ChildClass_TUV_300 extends ParentClass_Mahendra{

    public static void main(String[] args) {
        ChildClass_TUV_300 cd = new ChildClass_TUV_300();
        cd.Body();
        cd.Break();
        cd.Gear();
        cd.Light();
        cd.Child_car_engine();


    }
    public void Child_car_engine(){
        System.out.println("Engine used in TUV 300 is :"+ engine + " - Child class method and parent class variable ");
    }
}

//class Parent_A{ }
//
//Class Parent_B {}
//
//Class extends Parent_A,Parent_B{} -
//Java does not support muliple inheritence unlike C++, so used inheritence here





//class Parent_A{
//    int a = 20;
// }
//Class Child_A extends Parent_A{
//    int a= 10;
//}
//class Main(){
//    public static void main(String[] args) {
//        Child_A ca = new Child_A(); -> object of "Child_A" which has to properties of "Child_A"
//        System.out.println(ca.a); --> Prints a=10
//
//        Parent_A pa = new Child_A();-> object of "Child_A" which has to properties of "Parent_A"
//        System.out.println(pa.a); --> Prints a=20
//    }
//}