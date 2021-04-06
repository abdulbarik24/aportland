package practice;

public class LearnConditionalStatements {
    public void IfStatments() {
        int x = 10;
        if (x < 20) {
            System.out.println("This is if statment");
        }
    }

    public void IfElseStatements() {
        int x = 30;

        if (x < 20) {
            System.out.println("This is if statement");
        } else {
            System.out.println("This is else statement");
        }
    }

    public void NestedIfStatements() {
        int x = 30;
        int y = 10;

        if (x < 35) {
            if (y < 15) {
                System.out.println("X = " + x + "and Y = " + y);
            }
        }
    }

    public void switchStatement(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Great!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Try next time");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your Grade is: " + grade);
    }

    public void learnIfElse(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Grate!");
        } else if (grade == 'C') {
            System.out.println("Well done!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Try next time");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }


    public void conditionalOperator() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is: " + b);


        b = (a == 10) ? 20:30;
        System.out.println("Value of b is: " + b);
    }




}
