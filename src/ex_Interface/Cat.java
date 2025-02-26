package ex_Interface;

public class Cat implements Animal {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.Sound();
    }

    @Override
    public void Sound() {
        System.out.println("MEOW");
    }
}
