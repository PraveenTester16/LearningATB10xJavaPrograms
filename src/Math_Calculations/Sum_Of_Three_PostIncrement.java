package Math_Calculations;

public class Sum_Of_Three_PostIncrement {

    public static void main(String[] args) {


        	int a = 20;
	int b = a++;
        /*Post-increment (a++) assigns the value first, then increments.
                b = a++ → b gets 20, and a becomes 21.
        a retains 21 throughout the remaining print statements.*/
	System.out.println("what will be the value of a " +a);
	System.out.println("what will be the value of b " +b);
	System.out.println("what will be the value of a " +a);


    }
}
