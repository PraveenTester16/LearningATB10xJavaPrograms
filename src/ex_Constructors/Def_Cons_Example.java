package ex_Constructors;

public class Def_Cons_Example {

    int rank;

    String player;

    Boolean choice = false;

 // Default constructor is given by compiler
    // here is default constructors present but we cannot see on naked eyes
    // can be find in calss files but not human readable

    public static void main(String[] args) {

        Def_Cons_Example def = new Def_Cons_Example();
        System.out.println(def.rank);// default value is given by the constructor
        System.out.println(def.player);
        System.out.println(def.choice);

    }
}
