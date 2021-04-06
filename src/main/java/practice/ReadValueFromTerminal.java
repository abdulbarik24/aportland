package practice;

import java.util.Scanner;

public class ReadValueFromTerminal {
//    public void getInputFromUser() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Your Name: ");
//        String s = scanner.nextLine();
//        System.out.println("Your entered string " + s);
//
//        System.out.print("Enter Your age: ");
//        int age = scanner.nextInt();
//        System.out.println("Your entered integer: " + age);
//
//        System.out.print("Enter product price: ");
//        float price = scanner.nextFloat();
//        System.out.println("You entered float " + price);
//    }


    public void getInputFromUser () {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter My Name");
        String s = in.nextLine();
        System.out.println("You entered string: " + s);
    }
}
