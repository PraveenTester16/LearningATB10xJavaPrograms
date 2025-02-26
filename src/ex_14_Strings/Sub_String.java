package ex_14_Strings;

public class Sub_String {

    public static void main(String[] args) {

        String sonName  = "Thasvikyash";
        String lastname = sonName.substring(7);
        System.out.println(lastname);

        String greet = "Welcome";
        String newGreet = greet.substring(3,7);
        System.out.println(newGreet);

    }
}
