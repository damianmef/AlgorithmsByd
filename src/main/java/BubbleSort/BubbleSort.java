package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        System.out.println("Podaj wielkość tablicy:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n];

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Podaj kolejną liczbę:");
            arrayN[i] = scanner.nextInt();
        }
        // Bubble Sort
        arrayN = doBubbleSort(arrayN);

        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }
    }

    public static int[] doBubbleSort(int[] arrayN) {

        int n = arrayN.length;

        if (n > 1) {
            boolean zmiana = true;
            while (zmiana) {

                zmiana = false;
                for (int i = n - 1; i > 0; i--) {
                    if (arrayN[i] < arrayN[i - 1]) {
                        int temp = arrayN[i];
                        arrayN[i] = arrayN[i - 1];
                        arrayN[i - 1] = temp;
                        zmiana = true;
                    }
                }

            }
        }
        return arrayN;
    }
}
