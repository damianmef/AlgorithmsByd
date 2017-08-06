package RandomNK;

import java.util.Random;
import java.util.Scanner;

public class RandomNK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elemntów tablicy: ");
        int size = scanner.nextInt();
        System.out.println("Podaj liczbę losowań: ");
        int k = scanner.nextInt();

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            inputArray[i] = scanner.nextInt();
        }
        int[] result = randomNK(inputArray, k);

        for (int i = result.length-1; i >= result.length-k; i--) {
            System.out.println("Wylosowany element: " + result[i]);
        }
    }

    public static int[] randomNK(int[] inputArray, int k) {
        int index = inputArray.length-1;
        Random random = new Random();
        int temp;
        while(k > 0) {
            int r = random.nextInt(index);
            temp = inputArray[r];
            inputArray[r] = inputArray[index];
            inputArray[index] = temp;
            index--;
            k--;
        }

        return inputArray;
    }
}
