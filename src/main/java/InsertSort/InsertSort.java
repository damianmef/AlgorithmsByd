package InsertSort;

import Helpers.Helper;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        int[] arrayN = Helper.getArrayFromUser();
        arrayN = doInsertSort(arrayN);
        Helper.printArray(arrayN);

    }

    public static int[] doInsertSort(int[] arrayN)
    {
        int[] arrayResult = new int[arrayN.length];
        if (arrayN.length > 0) {
            arrayResult[0] = arrayN[0];
        }
        if (arrayN.length > 1) {
            for(int i = 1; i < arrayN.length;i++) {
                boolean added = false;
                for(int j = 0;j < arrayResult.length; j++) {
                    if(arrayN[i] < arrayResult[j]) {
                        arrayResult = move(arrayResult, arrayN[i], j);
                        added = true;
                        break;
                    }
                }
                if (!added) {
                    arrayResult[i] = arrayN[i];
                }
            }
        }

        return arrayResult;
    }
    public static int[] move(int[] arrayResult, int insertValue, int insertIndex) {

        for (int i = arrayResult.length - 1; i > insertIndex; i--) {
            arrayResult[i] = arrayResult[i-1];
        }
        arrayResult[insertIndex] = insertValue;

        return arrayResult;
    }

}
