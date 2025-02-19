package All_Program_Exercise;

public class invert_Triangle {
    public static void main(String[] args) {

       int tri_Num = 6;
        // left triangle

        for (int i = 1; i <=tri_Num; i++) {
            for (int j = 1; j <= tri_Num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
