package ex_Interface;

public class LaLiga implements Football{


    @Override
    public void VAR() {
        System.out.println("Multiple camera angles are used");
    }

    @Override
    public void GoalLineTech() {
        System.out.println("Hybrid Bar with sensors");
    }

    public static void main(String[] args) {
        LaLiga LL = new LaLiga();
        LL.VAR();
        LL.GoalLineTech();
    }
}
