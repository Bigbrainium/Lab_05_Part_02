import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int monthOfBirth;

        System.out.println("What is your birth month? (Enter a number 1-12)");
        monthOfBirth = scan.nextInt();

        if (monthOfBirth == 1) {
            System.out.println("Your birth month is January");
        } else if (monthOfBirth == 2) {
            System.out.println("Your birth month is February");
        } else if (monthOfBirth == 3) {
            System.out.println("Your birth month is March");
        } else if (monthOfBirth == 4) {
            System.out.println("Your birth month is April");
        } else if (monthOfBirth == 5) {
            System.out.println("Your birth month is May");
        } else if (monthOfBirth == 6) {
            System.out.println("Your birth month is June");
        } else if (monthOfBirth == 7) {
            System.out.println("Your birth month is July");
        } else if (monthOfBirth == 8) {
            System.out.println("Your birth month is August");
        } else if (monthOfBirth == 9) {
            System.out.println("Your birth month is September");
        } else if (monthOfBirth == 10) {
            System.out.println("Your birth month is October");
        } else if (monthOfBirth == 11) {
            System.out.println("Your birth month is November");
        } else if (monthOfBirth == 12) {
            System.out.println("Your birth month is December");
        } else {
            System.out.println("You have entered an incorrect value.");
        }
    }
}