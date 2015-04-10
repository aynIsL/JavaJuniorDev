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
    public void testArrayIsNull() throws Exception{
        int[] leftArray = {1,3,4};
        int[] rightArray = null;
        String expectedValue ="An array shouldn`t be null.";
        ArrayUnion testClass = new ArrayUnion();
        try{
            testClass.leftUnion(leftArray, rightArray);;
            fail("Exception should be thrown!");
        }
        catch (NullArrayException e){
            assertEquals(expectedValue, e.getErrorCode());
        }

    }

    @Test
    public void testRightArrayEmpty() throws Exception {

        int[] rightArray = null;
        int[] leftArray = {1,2};
        String expectedValue = "An array shouldn`t be null.";
        ArrayUnion testClass = new ArrayUnion();
        int[] returnedValue = null;
        try{
            returnedValue = testClass.leftUnion(leftArray, rightArray);
            fail("Exception should be thrown!");
        }
        catch (NullArrayException exception){
            assertEquals(expectedValue, exception.getErrorCode());
        }
    }

    @Test
    public void testIsArrayEmpty() throws Exception {

        int[] rightArray = new int[0];
        int[] leftArray = {1,2};
        String expectedValue = "Array shouldn`t be empty";
        ArrayUnion testClass = new ArrayUnion();
        int[] returnedValue = null;
        try{
            returnedValue = testClass.leftUnion(leftArray, rightArray);
            fail("Exception should be thrown!");
        }
        catch (ArrayEmptyException exception){
            assertEquals(expectedValue, exception.getErrorCode());
        }
    }


}