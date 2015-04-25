package com.union;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArrayUnionTest {

    @Test
    public void testLeftUnion() throws Exception {
        int[] leftArray = {1,2,3,4};
        int[] rightArray = {5,7,8,2,1};

        int[] expectedValue = {1,2,3,4,2,1};

        ArrayUnion testClass = new ArrayUnion();
        int[] returnedValue = testClass.leftUnion(leftArray,rightArray);
        Assert.assertArrayEquals(expectedValue,returnedValue);

    }

    @Test
    //local code review (vtegza): method names should always start wit lover case symbol @ 21.04.15
    public void NullArrayTest() throws Exception{
        int[] leftArray = {1,3,4};
        int[] rightArray = null;
        String expectedValue ="An array shouldn`t be null.";
        ArrayUnion testClass = new ArrayUnion();
        try{
            testClass.leftUnion(leftArray, rightArray);;
            fail("Exception should be thrown!");
        }
        //local code review (vtegza): this class is not available @ 12.04.15
        catch (NullArrayException e){
            assertEquals(expectedValue, e.getErrorCode());
        }

    }


    @Test
    //local code review (vtegza): method names should always start wit lover case symbol @ 21.04.15
    public void EmptyArrayTest() throws Exception {

        int[] rightArray = new int[0];
        int[] leftArray = {1,2};
        String expectedValue = "Array shouldn`t be empty";
        ArrayUnion testClass = new ArrayUnion();
        int[] returnedValue = null;
        try{
            returnedValue = testClass.leftUnion(leftArray, rightArray);
            fail("Exception should be thrown!");
        }
        catch (EmptyArrayException exception){
            System.out.println(exception.getErrorCode());
            assertEquals(expectedValue, exception.getErrorCode());
        }
    }


}