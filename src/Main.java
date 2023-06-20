import java.util.Scanner;

public class Main {

    private static String mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "*****************************\n" +
                "Velkommen til kalkulatoren.\n" +
                "Velg et alternativ:\n\n" +
                "(1) Addisjon.\n" +
                "(2) Subtraksjon.\n" +
                "(3) Multiplikasjon.\n" +
                "(4) Divisjon.\n" +
                "(5) Avslutt.\n"
        );

        return scanner.nextLine();
    }

    private static boolean handleMenuChoice(String userInput, Calculator calc) {

        //# FIELDS
        boolean validInput = false;
        boolean exitProgram = false;
        int result = 0;

        while (!validInput) {

            validInput = true;

            switch (userInput) {
                case "1" -> {
                    result = calc.add();

                }
                case "2" -> {
                    result = calc.subtract();

                }
                case "3" -> {
                    result = calc.multiply();

                }
                case "4" -> {
                    result = calc.divide();

                }
                case "5" -> {
                    System.out.println("Hade bra! :)");
                    exitProgram = true;
                }
                default -> {
                    System.out.println("'%s', er ikke et gyldig alternativ.".formatted(userInput));
                    validInput = false;
                }
            }
        }

        if (!userInput.equals("5")) {

            System.out.println(
                    "________________________\n" +
                    "RESULT IS: " + result + "\n" +
                    "––––––––––––––––––––––––\n"
            );

        }

        return exitProgram;

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        boolean exitProgram = false;

        while (!exitProgram) {
            String userInput = mainMenu();
            exitProgram = handleMenuChoice(userInput, calc);

        }
    }
}