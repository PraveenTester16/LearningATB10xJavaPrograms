package ex_14_Strings;

public class StringBuffer_To_String {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // method to change StringBuffer to String
        String myString = sb.toString();

        System.out.println("Converted String is " + myString);


    }
}
