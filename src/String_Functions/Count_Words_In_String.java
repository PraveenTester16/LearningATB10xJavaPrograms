package String_Functions;

public class Count_Words_In_String {

    public static void main(String[] args) {


        String greet = "Hello my dear friend";

        String[] total = greet.split("\\s+");
        System.out.println("Total string is " + total.length);
    }
}
