package ex_14_Strings;

public class String_Pool_Concept {

    public static void main(String[] args) {

        String name1 = new String("YASH");
        String name2 = new String("YASH");

        String name3 ="YASH";
        String name4 = "YASH";

        System.out.println(name2 == name3); // false because this does not consider the content
        System.out.println(name3 == name4); // true because this points the same reference in the SCP

        System.out.println(name1.equals(name2));



    }
}
