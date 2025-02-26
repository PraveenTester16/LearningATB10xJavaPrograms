package ex_14_Strings;

public class String_Pool_Behaviour {
    public static void main(String[] args) {

        String myS1 = "YASH";
        String myS2 = "YASH";

        String myS3 = new String("YASH");

        System.out.println(myS1 == myS2); // points to the same pool object
        System.out.println(myS1 == myS3); // new object hence false

    }
}
