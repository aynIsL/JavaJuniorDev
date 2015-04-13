package com.company;

import com.union.ArrayUnion;
import com.union.ServiceDelegate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] firstArray = {1,2,3,4,7,17,54,89};
        int[] secondArray = {1,2,3,5,7,54,89};

        ArrayUnion  arrayUnion = new ArrayUnion();
        ServiceDelegate serviceDelegate = new ServiceDelegate(arrayUnion);

        int result[] = serviceDelegate.innerUnion(firstArray, secondArray);
        System.out.println("Inner union : " + Arrays.toString(result));

        result = serviceDelegate.leftUnion(firstArray, secondArray);
        System.out.println("Left unioin : " + Arrays.toString(result));
    }

}
