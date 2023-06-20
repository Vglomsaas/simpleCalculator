import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.Vector;

public class Main {

    private static String mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Velkommen til kalkulatoren.\n" +
                "Velg et alternativ:\n\n" +
                "(1) Addisjon.\n" +
                "(2) Subtraksjon.\n" +
                "(3) Multiplikasjon.\n" +
                "(4) Divisjon.\n"
        );

        return scanner.nextLine();
    }

    private static void handleMenuChoice(String userInput, Calculator calc) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int result;

        while (!validInput) {
            switch (userInput) {
                case "1":
                    result = calc.add();
                    System.out.println("Result is: " + result);
                    validInput = true;
                break;

                case "2":
                    result = calc.subtract();
                    System.out.println("Result is: " + result);
                    validInput = true;

                break;

                case "3":
                    result = calc.multiply();
                    System.out.println("Result is: " + result);
                    validInput = true;

                break;

                case  "4":
                    result = calc.divide();
                    System.out.println("Result is: " + result);
                    validInput = true;

                break;

                default:
                    System.out.println("'%s', er ikke et gyldig alternativ.");

                break;
            }
        }

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        String userInput = mainMenu();

        handleMenuChoice(userInput, calc);
    }
}