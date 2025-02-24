package ex_Abstraction;

public class One_Day_Cricket extends  Test_Cricket{

    @Override
public void FivedaysMatch(){
    System.out.println("Instead for 5days i will make it one day with 50 overs an innings");
}

@Override
public void redBall(){
    System.out.println("I will use White ball instead of Red Ball");
}

    public static void main(String[] args) {
 Test_Cricket cricket = new One_Day_Cricket();
 cricket.FivedaysMatch();
 cricket.redBall();
    }
}
