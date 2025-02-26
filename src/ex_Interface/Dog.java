package ex_Interface;

public class Dog implements Animal{


    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
    }

    @Override
    public void Sound() {
        System.out.println("BOWW");
    }
}
