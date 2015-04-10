package com.company;

import com.union.ArrayUnion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,7,17,54,89};
        int[] b = {1,2,3,5,7,17,99,62,67,98,66};

        ArrayUnion au = new ArrayUnion();
        int c[] = au.innerUnion(a,b);
        System.out.println(Arrays.toString(c));

        //System.out.println(Arrays.toString(c));
    }

}
