package ID;

import Helpers.Helper;

public class ID {
    public static void main(String[] args) {

        String idNumber = Helper.getStringFromUser("Podaj serię i numer dowodu osobistego: ");
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

        Helper.printInt(sum);

//        int[] values = new int[letters.length];
    }
}
