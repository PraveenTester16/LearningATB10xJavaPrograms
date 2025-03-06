package ex_14_Strings;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("HAPPY");


        //Even though two threads modify sb, one thread must wait for the other to finish.
        new Thread(() -> {
            sb.append(" World");
            System.out.println(sb);
        }).start();

        // Thread 2
        new Thread(() -> {
            sb.append(" Java");
            System.out.println(sb);
        }).start();

    }
}
