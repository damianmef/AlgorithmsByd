package ID;

import Helpers.Helper;

public class ID {
    public static void main(String[] args) {

        String idNumber = Helper.getStringFromUser("Podaj serię i numer dowodu osobistego: ");
//        checkId(idNumber);
        if(validateId(idNumber)) {
            checkId(idNumber);
        } else {
            Helper.printString("Nieprawidłowy numer");
        }
    }
    public static boolean validateId(String idNumber) {

        if (idNumber.length() != 9) {
            return false;
        }

        for (int i = 0; i< 3; i++) {
            int temp = idNumber.charAt(i);
            if (temp < 65 && temp > 90) {
                return false;
            }
        }

        for (int i=3; i < 9; i++) {
            int temp = idNumber.charAt(i);
            temp -= 48;
            if(temp < 0 && temp > 9) {
                return false;
            }
        }


        return true;
    }

    public static void checkId(String idNumber) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int sum = 0;

        /*ABS123456*/
        /* Przejście po literach */
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(idNumber.charAt(i) == alphabet[j]) {
                    int charValue = j+10;
                    switch (i) {
                        case 0:
                            sum += charValue*7;
                            break;
                        case 1:
                            sum += charValue*3;
                            break;
                        case 2:
                            sum += charValue;
                            break;
                    }
                }
            }
        }

        for (int i=4; i < 9; i++) {
            int temp = idNumber.charAt(i);
            temp -= 48;
            switch(i) {
                case 4:
                case 7:
                    sum += temp*7;
                    break;
                case 5:
                case 8:
                    sum += temp*3;
                    break;
                case 6:
                    sum += temp;
                    break;
            }
        }

        int mod = sum % 10;
        int temp = idNumber.charAt(3);
        temp -= 48;
        if (mod == temp) {
            Helper.printString("Poprawna suma kontrolna");
        } else {
            Helper.printString("Niepoprawna suma kontrolna");
        }
    }

}
