package ex_10_For_Loop;

public class Sum_of_even_Numbers {

    public static void main(String[] args) {

        int sum = 2;

        for (int i = 0; i<=100;i++){

            sum = sum + i;
        }

        System.out.println("sum of even num " + sum);
    }
}
