package Ex_16_Arrays;

public class Simple_Array {

    public static void main(String[] args) {

        int [] myArray = {1,2,3,4,5,6};

        System.out.println(myArray[0]); // index starts from zero
       // System.out.println(myArray[6]); ArrayIndexOutOfBoundsException because of the index is more than length

        System.out.println(myArray.length); // Length starts from one
    }
}
