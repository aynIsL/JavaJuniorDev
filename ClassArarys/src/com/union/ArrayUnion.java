package com.union;

import java.util.Arrays;

/**
 * Created by Ivan on 02.04.2015.
 */
public class ArrayUnion {

    public static int[] leftUnion(int[] leftArray, int[] rightArray) {

        int[] temp = new int[leftArray.length + rightArray.length];
        int counter = 0;
        for (int leftElem : leftArray) {
            temp[counter] = leftElem;
            counter++;
        }

        for(int rightElem : rightArray){
            for(int tempElem : temp){
                if(rightElem == tempElem){
                    temp[counter++] = rightElem;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(temp, counter);
        return result;
    }

    public static int[] innerUnion(int[] leftArray, int[] rightArray){
        int totalSize = leftArray.length + rightArray.length;
        int[] temp = new int[totalSize];
        int counter = 0;
        Arrays.sort(rightArray);
        //Arrays.sort(leftArray); //nicely display result
        for(int leftElem: leftArray){
            int index = Arrays.binarySearch(rightArray, leftElem);
            if(index>=0) {
                temp[counter++] = rightArray[index];
            }
        }
        int[] result = Arrays.copyOf(temp, counter);
        return result;
    }



}
