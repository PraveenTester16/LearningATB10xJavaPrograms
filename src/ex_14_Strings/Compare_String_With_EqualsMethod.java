package ex_14_Strings;

public class Compare_String_With_EqualsMethod {

    public static void main(String[] args) {

        String str1 = new String("TIGER");
        String str2 = new String("TIGER");
        String str3 = "TIGER";
        String str4 = "tiger";

        // String with New keyword
        System.out.println(str1.equals(str2)); // true
        // String Literal
        System.out.println(str1.equals(str3)); // true

       // System.out.println(str1.equals(str4)); // false beacuse this is case sensitive

        System.out.println(str1.equalsIgnoreCase(str4));

    }
}
