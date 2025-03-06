package Access_Modifiers;

public class Child_One extends Parent_One {

    public static void main(String[] args) {


        Child_One childOne = new Child_One();
        childOne.method1();

        // childOne.method2 -> This cannot accessed because thats private method
        childOne.method3();
        childOne.method4();
    }
}
