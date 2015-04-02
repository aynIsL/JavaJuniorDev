package com.company;

import java.util.Arrays;
import com.union.ArrayUnion;

public class Main {

    public static void main(String[] args) {

        int[] first = {1, 5, 4, 23, 65, 32, 78,0,2};
        int[] second = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] third = {1,4,17,02,34,0,2};

        int[] temp = ArrayUnion.leftUnion(first,third);
        System.out.println(Arrays.toString(temp));
    }

}
