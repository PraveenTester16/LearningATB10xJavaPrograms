package ex_Abstraction;

public class T20_International extends Test_Cricket{

    public void FivedaysMatch(){
        System.out.println("i can shorter this game for 1 hour ");
    }

    public void redBall(){
        System.out.println("Will use a less weight white ball");
    }

    public static void main(String[] args) {

        Test_Cricket myTest = new T20_International();
        myTest.FivedaysMatch();
        myTest.redBall();

    }
}
