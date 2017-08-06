package TheAbsoluteValue;

import java.util.Scanner;

public class TheAbsoluteValue {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;

        System.out.println("Podaj liczbe");
        number = myScanner.nextInt();

        int result = getAbsolute(number);

        System.out.println("Wynik to " + result);


    }


    public static int getAbsolute(int number){
        int result;

        if (number > 0) {
            result = number;
        }
        else {
            result = number * -1;
        }

        return  result;
      }
}
