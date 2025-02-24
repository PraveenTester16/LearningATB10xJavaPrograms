package ex_Polymorphism_Concept;

public class Sleeper_Bus extends Bus {


    @Override
    public void MusicSystem(){
        System.out.println("Latest Atmos technology used");
    }

    public static void main(String[] args) {
       Bus newBus = new Sleeper_Bus();
       newBus.AirConditioner();
       newBus.MusicSystem(); // LAte Binding or run time
    }
}
