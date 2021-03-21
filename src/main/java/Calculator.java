import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int choiceUser = 0;
        do {
            System.out.println("Jakie działanie chcesz wykonać? \n1) Odejmowanie\n2) Dodawanie\n3) Mnożenie\n4) Dzielenie\n5) Zakończ " + "program" + " ");
            System.out.flush();
            choiceUser = userChoice();
        } while (choiceUser != 5);
        System.out.println("Koniec");
    }

    public static int userChoice() {
        Scanner user = new Scanner(System.in);
        int choiceUser = user.nextInt();
        switch (choiceUser) {
            case 1:
                performSubtraction();
                break;
            case 2:
                performAddition();
                break;
            case 3:
                performMultiplication();
                break;
            case 4:
                performDivision();
                break;
            case 5:
                break;
        }

        return choiceUser;
    }

    public static void performSubtraction() {
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę a = ");
        int userNumberOne = user.nextInt();
        System.out.println("Podaj liczbę b = ");
        int userNumberTwo = user.nextInt();
        int subtraction = userNumberOne - userNumberTwo;
        System.out.println("Wynik odejmowania liczby a = " + userNumberOne + " oraz liczby b = " + userNumberTwo + " wynosi = " + subtraction);
    }

    public static void performAddition() {
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę a = ");
        int userNumberOne = user.nextInt();
        System.out.println("Podaj liczbę b = ");
        int userNumberTwo = user.nextInt();
        int sum = userNumberOne + userNumberTwo;
        System.out.println("Wynik dodawania liczby a = " + userNumberOne + " oraz liczby b = " + userNumberTwo + " = " + sum);
    }

    public static void performMultiplication() {
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę a = ");
        int userNumberOne = user.nextInt();
        System.out.println("Podaj liczbę b = ");
        int userNumberTwo = user.nextInt();
        int multiplication = userNumberOne * userNumberTwo;
        System.out.println("Wynik mnożenia liczby a = " + userNumberOne + " oraz liczby b = " + userNumberTwo + " = " + multiplication);
    }

    public static void performDivision() {
        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę a = ");
        int userNumberOne = user.nextInt();
        System.out.println("Podaj liczbę b = ");
        int userNumberTwo = user.nextInt();
        int division = userNumberOne / userNumberTwo;
        System.out.println("Wynik dzielenia liczby a = " + userNumberOne + " oraz liczby b = " + userNumberTwo + " = " + division);
    }
}
