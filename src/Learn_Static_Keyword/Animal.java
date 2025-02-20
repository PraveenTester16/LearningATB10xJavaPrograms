package Learn_Static_Keyword;

public class Animal {

    public static void Lion(){
        System.out.println("This is a lion method called in a static way");
    }

    public void Tiger(){
        System.out.println("This is a Tiger method");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Lion(); // A static method can be called in static way and object creation is needed
        myAnimal.Tiger();
    }
}
