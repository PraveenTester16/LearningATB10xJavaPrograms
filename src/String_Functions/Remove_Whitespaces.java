package String_Functions;

public class Remove_Whitespaces {

    public static void main(String[] args) {

        String name = " Thasvik Yash ";
        String result = name.replaceAll("\\s", "");

        System.out.println("Original String" + name);
        System.out.println("result string with space removed " + result);
    }
}
