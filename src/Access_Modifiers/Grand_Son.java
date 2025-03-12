package Access_Modifiers;

public class Grand_Son extends Grand_Father {

    @Override
    public void Benz(){
        System.out.println("I understand This is a legacy and very rare car " +
                "but i will install my brand new music system");
    }

    @Override
    protected void AlloyWheels(){
        System.out.println("Diamond cut alloys");
    }

   /* @Override
    private void sunroof(){
        System.out.println("Panaromic sunroof auto touch");
    }*/
}


