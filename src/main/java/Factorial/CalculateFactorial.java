package Factorial;

import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Podaj liczbe: " );
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Wartość nieprawidłowa: ");
        } else {
            System.out.println("Wartosc silni: " + calculateFactorial(n));
        }
    }

    public static int calculateFactorial(int n) {
        if (n<=1) {
            return 1;
        } else {
            return n*calculateFactorial(n-1);
        }
    }
}
