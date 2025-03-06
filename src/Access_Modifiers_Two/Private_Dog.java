package Access_Modifiers_Two;

import Learn_Static_Keyword.Animal;

public class Private_Dog extends Animal {

    private void Sound(){
        System.out.println("All Dogs makes sound");
    }

    public static void main(String[] args) {
        //Private_Dog dog = new Private_Animal();
        Private_Dog dog = new Private_Dog();
        dog.Sound();
    }
}
