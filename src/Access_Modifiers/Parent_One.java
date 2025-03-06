package Access_Modifiers;

public class Parent_One {


    public void method1(){
        System.out.println("This is a public method");
    }

    private void method2(){
        System.out.println("This is Private method");
    }

    protected void method3(){
        System.out.println("This is Protected method");
    }

    void method4(){
        System.out.println("This is Default method");
    }

    public static void main(String[] args) {
        Parent_One parentOne = new Parent_One();
        parentOne.method2(); // This is a private method so its only access within the same class
    }
}
