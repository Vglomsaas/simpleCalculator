import java.util.Scanner;

public class Calculator {

    //METHODS
    public int add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn tall:");

         int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv inn tall:");

        int b = Integer.parseInt(scanner.nextLine());

        return a + b;
    }
    public int subtract() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn tall:");

        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv inn tall:");

        int b = Integer.parseInt(scanner.nextLine());

        return a - b;
    }
    public int multiply() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn tall:");

        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv inn tall:");

        int b = Integer.parseInt(scanner.nextLine());

        return a * b;
    }
    public int divide () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn tall:");

        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv inn tall:");

        int b = Integer.parseInt(scanner.nextLine());

        return a / b;
    }
}