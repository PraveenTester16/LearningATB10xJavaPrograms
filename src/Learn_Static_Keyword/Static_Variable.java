package Learn_Static_Keyword;

public class Static_Variable {

    static int score = 0;
    String playerName;


    public static void main(String[] args) {

        Static_Variable var1 = new Static_Variable();
        var1.playerName="Virat";
        var1.score = 100;

        Static_Variable var2 = new Static_Variable();
        var2.playerName="Rohit";
        var2.score=200;

        System.out.println(var1.playerName);
        System.out.println(var1.score);
        System.out.println(var2.playerName);
        System.out.println(var2.score);

    }
}
