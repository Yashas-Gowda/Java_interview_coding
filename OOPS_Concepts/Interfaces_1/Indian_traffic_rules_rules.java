package OOPS_Concepts.Interfaces_1;

public class Indian_traffic_rules_rules implements World_trafic_rules, Asian_Traffic_rules {
    public static void main(String[] args) {
        World_trafic_rules wt = new Indian_traffic_rules_rules();  //--> Object "wt" can access from
                                                 // interface World_trafic which are defined in Asian_Trafic class
        wt.redLight();
        wt.greenLight();
        wt.yelloLight();
        System.out.println("a from interface: "+wt.a);

        Indian_traffic_rules_rules at = new Indian_traffic_rules_rules();
        at.OrangeLight();

        Asian_Traffic_rules WHO_t = new Indian_traffic_rules_rules();
        WHO_t.Asian_Rules();




    }

    @Override
     public void redLight(){
         System.out.println("red Light");
     };

    @Override
    public void yelloLight(){
        System.out.println("yelloLight");
    }

    @Override
    public void greenLight() {
        System.out.println("yelloLight");

    };

    public void OrangeLight() {
       System.out.println("OrangeLight");
    }




    @Override
    public void Asian_Rules() {
        System.out.println("Asian_Rules");
    }
}
