package com.union;

public class ServiceDelegate {
    private final ArrayUnion union;

    public ServiceDelegate(ArrayUnion union) {
        this.union = union;
    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) throws Exception {
        return union.leftUnion(leftArray,rightArray);
    }

    public int[] innerUnion(int[] leftArray, int[] rightArray) {
        return union.innerUnion(leftArray,rightArray);
    }
}
