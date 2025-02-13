package Ex_16_Arrays;

import java.util.Arrays;

public class Arrays_Iterate {

    public static void main(String[] args) {

        int [] score = new int[4];

        score [0] = 100;
        score [1] = 0;
        score [2] = 55;
        score [3] = 78;

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        Arrays.sort(score); // {51,87,90,91,100};
        int item_index = Arrays.binarySearch(score, 100);
        System.out.println(item_index);
    }
}
