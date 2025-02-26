package ex_Polymorphism_Concept.OverLoadingEx;

public class MathOperationUsingOverLoad {

    int maths(int a , int b){
return a + b;
    }

    int maths(int a, int b , int c){
return a + b+ c;
    }

    double maths(double x , double y){
        return x + y;
    }


    public static void main(String[] args) {

MathOperationUsingOverLoad math = new MathOperationUsingOverLoad();
        System.out.println(math.maths(5,5));
        System.out.println(math.maths(10,10,10));
        System.out.println(math.maths(4.5,4.5));
    }
}
