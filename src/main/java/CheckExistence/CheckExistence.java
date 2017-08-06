package CheckExistence;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckExistence {

    private static boolean checkExistence(int[] array, int number) {
        boolean result = false;
        for (int element: array) {
            if (element == number) {
                result = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elemntów tablicy: ");
        int size = scanner.nextInt();
        System.out.println("Podaj szukana liczbe: ");
        int number = scanner.nextInt();


        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Czy istnieje? : " + checkExistence(array, number));
    }
}