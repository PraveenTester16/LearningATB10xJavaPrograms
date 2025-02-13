package Ex_16_Arrays;

public class Array_String {

    public static void main(String[] args) {

        String [] names = new String[5];

        names [0] = "Praveen";
        names [1] = "Vidhya";
        names [2] = "Thasvik";
        names [3] = "Thanvik";
        names [4] = "Krish";

        System.out.println(names.length);
        System.out.println(names[3]);

        boolean [] canVote = new boolean[2];
        canVote [0] = true;
        canVote [1] = false;

        System.out.println(canVote[1]);
    }
}
