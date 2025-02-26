package ex_14_Strings;

public class String_Ineffecient {

    public static void main(String[] args) {
        
        String str = "";

        for (int i = 1; i <=5 ; i++) {  // Creates a new string object in each iteration
            str = str+ i;
        }

        System.out.println(str);
    }
}
