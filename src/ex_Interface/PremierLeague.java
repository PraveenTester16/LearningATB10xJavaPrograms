package ex_Interface;

public class PremierLeague implements Football{

    @Override
    public void VAR() {
        System.out.println("We use multiple VAR associates");
    }

    @Override
    public void GoalLineTech() {
        System.out.println("Accurate Sensors");
    }

    public static void main(String[] args) {
        PremierLeague Pl = new PremierLeague();
        Pl.VAR();
        Pl.GoalLineTech();
    }
}

