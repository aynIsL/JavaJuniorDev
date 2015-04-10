package com.union;

import java.util.Arrays;

public class ArrayUnion {


    public int[] leftUnion(int[] leftArray, int[] rightArray) throws Exception {
        if (Arrays.equals(leftArray, null) || Arrays.equals(rightArray, null)) {
            throw new NullArrayException();
        }
        else if( leftArray.length ==0 || rightArray.length==0 ) throw new ArrayEmptyException();
        else {
            int[] temp = new int[leftArray.length + rightArray.length];
            int counter = 0;
            for (int leftElem : leftArray) {
                temp[counter] = leftElem;
                counter++;
            }

            for (int rightElem : rightArray) {
                for (int tempElem : temp) {
                    if (rightElem == tempElem) {
                        temp[counter++] = rightElem;
                        break;
                    }
                }
            }
            int[] result = Arrays.copyOf(temp, counter);
            return result;
        }
    }

    public int[] innerUnion(int[] leftArray, int[] rightArray){
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
