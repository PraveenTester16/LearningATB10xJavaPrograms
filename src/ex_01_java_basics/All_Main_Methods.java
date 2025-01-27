package ex_01_java_basics;

public class All_Main_Methods {

    public static void main(String[] args) {
        System.out.println("This is the entry point of execution");
        main();
        main("Hello");
        main("Manager", "Grade A");
    }

    public static void main() {
        System.out.println("main function with no args");
    }

    public static void main(String name) {
        System.out.println("with one String args");
    }

    public static void main(String role , String position) {
        System.out.println("with two string args");
    }
}
