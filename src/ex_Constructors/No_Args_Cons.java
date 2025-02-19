package ex_Constructors;

public class No_Args_Cons {

    String myName;
    int myAge;

    // No Args constructors
    No_Args_Cons(){
myName = "Praveen";
myAge = 34;
        System.out.println("No Agrs Const created");
    }


    public static void main(String[] args) {
No_Args_Cons noArgs = new No_Args_Cons();
        System.out.println(noArgs.myName);
        System.out.println(noArgs.myAge);
    }
}
