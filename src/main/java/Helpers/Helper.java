package Helpers;

import java.util.Scanner;

public class Helper {

    public static int[] getArrayFromUser()
    {
        System.out.println("Podaj wielkość tablicy:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Podaj kolejną liczbę:");
            arrayN[i] = scanner.nextInt();
        }

        return  arrayN;
    }

    public static int[] getArrayFromUserBySize()
    {
        System.out.println("Podaj wielkość tablicy:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n-1];

        for(int i = 0; i < arrayN.length;i++) {
            arrayN[i] = i+2;
        }

        return arrayN;
    }



    public static void printArray(int[] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }
    }
}
