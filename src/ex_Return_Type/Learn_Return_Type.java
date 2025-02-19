package ex_Return_Type;

public class Learn_Return_Type {

    public int code = 1234;

    public int getCodeNumber(){
        System.out.println("code :" + code);
        return code;
    }

    public static void main(String[] args) {
        Learn_Return_Type codeType = new Learn_Return_Type();
        int newCode = codeType.getCodeNumber();
        System.out.println("Yes new Code received:" + newCode);


    }
}
