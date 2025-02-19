package All_Program_Exercise;

public class SmallestLargestString {

    public static void main(String[] args) {
        String input = "vision without action is day dream"; // Given input

        String[] words = input.split(" "); // Split the string into words

        String smallest = words[0]; // Initialize with the first word
        String largest = words[0];

        // Loop through all words to find the smallest and largest
        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word; // Update smallest word
            }
            if (word.length() > largest.length()) {
                largest = word; // Update largest word
            }
        }

        // Print the results
        System.out.println("Smallest String: \"" + smallest + "\"");
        System.out.println("Largest String: \"" + largest + "\"");
    }

}
