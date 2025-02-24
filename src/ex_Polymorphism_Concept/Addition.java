package ex_Polymorphism_Concept;

public class Addition {


    public int add(int a , int b){
return a + b;

    }

    public double add(double d , double e){
return d + e;
    }

    public float add(float f , float g){
        return f + g;
    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        System.out.println(addition.add(2,2));
        System.out.println(addition.add(2.2,4.4));
        System.out.println(addition.add(20.20,33.33));;;;;;;;;;;;;;;

    }
}
