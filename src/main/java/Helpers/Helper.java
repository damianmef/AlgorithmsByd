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

    public static String getStringFromUser(String info)
    {
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        String result  = scanner.nextLine();
        return result;
    }


    public static void printArray(int[] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }
    }

    public static void printInt(int n) {
        System.out.println(n);
    }
    public static void printString(String s) {
        System.out.println(s);
    }
}
