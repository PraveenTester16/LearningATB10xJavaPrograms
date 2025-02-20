package Learn_Static_Keyword;

public class StaticBlock {

    // always java gives priority to the static block than the main method
    // This happens when the class loads
    static {
        System.out.println("This is static 1");
    }

    static {
        System.out.println("This is static 2");
    }

    static{
        System.out.println("This is static 3");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
