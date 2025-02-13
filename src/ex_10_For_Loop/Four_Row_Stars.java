package ex_10_For_Loop;

public class Four_Row_Stars {

    public static void main(String[] args) {

        // Print the below pattern
        //   0123
        /*  0****
            1****
            2****
            3****   */

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
