package ra;

import java.util.Locale;
import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String userInput = input.next();
        char grade = (char) (userInput.charAt(0) - 'a' + 'A');

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Great!");
            case 'C':
            case 'D':
                System.out.println("Well done!");
                break;
            case 'F':
                System.out.println("Sorry, you failed.");
                break;
            default:
                System.out.println("Error! Invalid grade.");
        }
    }
}
