package ex_Inheritance_Concept;

public class OneDayCricket extends Cricket {

    public static void main(String[] args) {

        OneDayCricket Odi = new OneDayCricket();
        Odi.players = "11";
        Odi.wickets = 6;
        System.out.println("Test rules are inherited by ODI with " + Odi.players + " Players and " + Odi.wickets + " wickets");
    }
}
