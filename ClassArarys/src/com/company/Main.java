package com.company;

import com.union.ArrayUnion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] first = {1,2,3,4,7,17,54,89};
        int[] second = {1,2,3,5,7};

        ArrayUnion au = new ArrayUnion();
        int result[] = au.innerUnion(first, second);
        System.out.println("Inner union : " + Arrays.toString(result));


        result = au.leftUnion(first, second);
        System.out.println("Left unioin : " + Arrays.toString(result));

        //System.out.println(Arrays.toString(c));
    }

}
