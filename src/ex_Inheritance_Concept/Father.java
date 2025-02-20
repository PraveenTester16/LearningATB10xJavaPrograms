package ex_Inheritance_Concept;

public class Father extends Grandpa {

    public void Car(){
        System.out.println("Father Car");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.Land();
    }
}
