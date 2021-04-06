package practice;

import java.util.Random;

public class LearnMath {
    public void randomMethod () {
        Random rand = new Random();

        //generate random integers
        int rand_int1 = rand.nextInt(1000);
        double rand_double = rand.nextDouble();

        System.out.println(rand_int1);
        System.out.println(rand_double);
    }

    public void roundMethod() {
//        double num1 = 14.50;
//        System.out.println(Math.round(num1));

//        float num2 = 1337.645523f;
//        System.out.println(Math.round(num2));
//        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));
    }

}
