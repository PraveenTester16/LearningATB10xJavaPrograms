package String_Functions;

public class Learn_String {

    public static void main(String[] args) {

        String myString1 = "Yash";
        String myString2 = "Yash";

        String myString3 = new String("Yash");
        System.out.println(myString1);

        String name = "Praveen";
        String name1 = "Raghu";

        // 1 . charAt()
        System.out.println(name.charAt(3));

        // 2 . concat
        System.out.println(name.concat(" Yash"));

        // 3 . contains
        System.out.println(name.contains("P"));

        // 4 . Equals
        System.out.println(name.equals("Praveen"));

        // 5 . Equals Ignorecase
        System.out.println(name.equalsIgnoreCase("Praveen"));

        // 6 . indexof
        System.out.println(name.indexOf("r"));

        // 7 . Length
        System.out.println(name.length());

        // 8 . Replace
        System.out.println(name.replace("P","p"));

        // 9 . Split
        String name3 = "Vidhya Praveen";

        // 10 . substring
        System.out.println(name.substring(1,3)); // 3 will be omited

        // 11. tolowercase
        System.out.println("YASH".toLowerCase());

        // 12 . to lowercase
        System.out.println("vidhya".toUpperCase());

        // 13 . replaceall
        String myName = "Krish";
        System.out.println(myName.replaceAll("", "*"));

        // 14 . startswith
        System.out.println(name.startsWith("R"));

        // 15 . endswith
        System.out.println(name.endsWith("n"));

        // 16 . isempty
        String newName = "";
        System.out.println(newName.isEmpty());

        // 17 . Trim
        String name4 = "   ROYAL ENFIELD   ";
        System.out.println(name4.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Praveen"));

        // Compare to Ignorecase
        System.out.println(name.compareToIgnoreCase("praveen"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());













    }
}
