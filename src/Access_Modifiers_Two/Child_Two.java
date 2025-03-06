package Access_Modifiers_Two;

import Access_Modifiers.Parent_One;

public class Child_Two extends Parent_One {

    public static void main(String[] args) {

        // Default method cannot be accessed with different packages

        Child_Two childTwo = new Child_Two();
        childTwo.method1();
        childTwo.method3();
    }
}
