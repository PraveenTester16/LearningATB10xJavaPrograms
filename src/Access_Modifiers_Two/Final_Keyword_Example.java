package Access_Modifiers_Two;

public class Final_Keyword_Example {


    public final int value1 = 100;
    private final int value2 = 200;
    protected int value3;

    // Constructor

    public void MyConstructor(int myValue){
        this.value3 = myValue;
    }

    public void changeValue(){
        // value1 = 101; // Cannot change
    }

    public static void main(String[] args) {

        Final_Keyword_Example finalKeywordExample = new Final_Keyword_Example();
        System.out.println(finalKeywordExample.value3);

    }
}
