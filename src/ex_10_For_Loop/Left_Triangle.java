package ex_10_For_Loop;

public class Left_Triangle {

    public static void main(String[] args) {

        int rows = 1;

//        for (int i =totalRows ; i >=totalRows ; i--)
//            for (int j = totalRows ; j >=i; j--)

        for (int i = 1; i <= rows; i--) {

            for (int j = 5; j >= i; j++) {
                System.out.println("*");

            }

        }
    }
}

