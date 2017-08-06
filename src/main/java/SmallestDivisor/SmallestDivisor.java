package SmallestDivisor;

import java.util.Scanner;

public class SmallestDivisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two integer values: ");
        int userInputA = scanner.nextInt();
        int userInputB = scanner.nextInt();
        System.out.println(getSmallestDivisor(userInputA, userInputB));

    }

    private static int getSmallestDivisor(int a, int b) {

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;

    }
}


