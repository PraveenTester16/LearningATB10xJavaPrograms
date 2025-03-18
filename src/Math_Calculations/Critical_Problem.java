package Math_Calculations;

public class Critical_Problem {

    public static void main(String[] args) {


        	int a = 110;
	int b = a--;
	System.out.println("the value of b is " +b); // b = 110


	int d = --a;
	System.out.println("the value of D is " + d); // d= 108
    System.out.println("the value of A is " +a); // a = 108

     int l = b--;
	System.out.println("the value of 1 is " +l); // l = 110
	System.out.println("the value of b is " +b); // b = 109

	int s = d-- + --b;
	System.out.println("the value of S is " +s); // s = 108 + 108 = 216

	s = --d + --b;
	System.out.println("the value of S is " +s); // s = 107 + 108
	System.out.println("the value of b is " +b); // b = 107
	System.out.println("what will be the value of "+ b++);
	System.out.println("what will be the value of "+ ++b);
	System.out.println("what will be the value of "+ b--);
	System.out.println("what will be the value of "+ --b);

    }
}
