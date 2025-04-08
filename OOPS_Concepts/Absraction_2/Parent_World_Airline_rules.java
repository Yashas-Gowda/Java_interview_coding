package OOPS_Concepts.Absraction_2;

public abstract class Parent_World_Airline_rules {

    public abstract void Colour();  // THis Parent class method is abstract so we cannot use private,
    public abstract void name(); // we can use only public and protected as it method should be defiled in child class

    public void engine() {
        System.out.println(" Parent_World_Airline_rules for engine");
    }

    public void SafetyGuidelines() {
        System.out.println(" Parent_World_Airline_rules for SafetyGuidelines");
    }


}

