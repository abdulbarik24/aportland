package practice;

public class LearnStaticMethod {
    int a;
    static int b;

    LearnStaticMethod() {
        b++;
    }

    public void showDate() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }


    public static void increment() {
        System.out.println("Value of b is " + b);
    }
}
