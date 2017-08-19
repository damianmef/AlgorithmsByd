package BubbleSort;

import Helpers.Helper;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayN = Helper.getArrayFromUser();
        arrayN = doBubbleSort(arrayN);
        Helper.printArray(arrayN);
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
