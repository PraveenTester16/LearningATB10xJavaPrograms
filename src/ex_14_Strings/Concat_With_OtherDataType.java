package ex_14_Strings;

public class Concat_With_OtherDataType {

    public static void main(String[] args) {

        System.out.println("Age: " + 25);        // Output: Age: 25
        System.out.println("Result: " + 10 + 5); // Output: Result: 105 (left-to-right evaluation)
        System.out.println(10 + 5 + " is sum");  // Output: 15 is sum (Addition happens first)
    }
}
