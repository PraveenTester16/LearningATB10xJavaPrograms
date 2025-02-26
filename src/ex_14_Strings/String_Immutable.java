package ex_14_Strings;

public class String_Immutable {

    public static void main(String[] args) {

        String name = "Praveen";
        String newName = "Praveen";

        String aThirdName = new String("Praveen");
        System.out.println(aThirdName);

        System.out.println(name == aThirdName);
    }
}
