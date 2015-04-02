package com.union;

import java.util.Arrays;

/**
 * Created by Ivan on 02.04.2015.
 */
public class ArrayUnion {



    public static int[] leftUnion(int[] leftArray, int[] rightArray) {

        int[] temp = new int[leftArray.length + rightArray.length];
        int counter = 0;
        for (int aFirst : leftArray) {
            temp[counter] = aFirst;
            counter++;
        }

        for(int rightElem : rightArray){
            for(int tempElem : temp){
                if(rightElem == tempElem){
                    temp[counter] = rightElem;
                    counter++;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(temp, counter);

        return result;
    }
}
