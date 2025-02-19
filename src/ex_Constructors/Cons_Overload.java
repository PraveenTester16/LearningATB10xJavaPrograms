package ex_Constructors;

public class Cons_Overload {

    int a = 10;
    Cons_Overload(){
        System.out.println("This is a no arg constructor");
    }

    Cons_Overload( int a){
        System.out.println("This is a param :" + a );
    }

    public static void main(String[] args) {
Cons_Overload cons1 = new Cons_Overload();
Cons_Overload cons2 = new Cons_Overload(10);
    }
}
