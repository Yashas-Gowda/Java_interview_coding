package OOPS_Concepts.Absraction_2;

public class Child_Indian_Airlines extends Parent_World_Airline_rules {
    public static void main(String[] args) {
        Child_Indian_Airlines ca = new Child_Indian_Airlines();
        ca.Colour();
    }



    @Override
    public void name() {
        System.out.println("Name of Indian Airlines is Indigo");
    }

    @Override
    public void Colour() {
        System.out.println("Name of Indian Airlines Indigo is Blue");
    }
}
