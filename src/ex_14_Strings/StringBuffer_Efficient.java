package ex_14_Strings;

public class StringBuffer_Efficient {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <6 ; i++) {
            sb.append(i); // modifies the same object
        }

        System.out.println(sb.toString());
    }
}
