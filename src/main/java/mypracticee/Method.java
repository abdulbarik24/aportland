package mypracticee;

public class Method {
    static void myMethod(String fname) {
        System.out.println(fname + "Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Barik");
        myMethod("Omar");
        myMethod("Ayesha");
    }

    public int AddNumbers(int a, int b) {
        int sum = a + b ;
        return sum;
    }


}

