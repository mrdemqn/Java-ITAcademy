package com.gmail.mrdemqnvip.arrays.array_five;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        boolean isRepeat;
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (100 * Math.random());
                do {
                    isRepeat = false;
                    for (int j = 0; j < i; j++) {
                        if (array[i] == array[j]) {
                            array[i] = (int) (100 * Math.random());
                            isRepeat = true;
                        }
                    }
                } while (isRepeat);
            }
            int maxNum = array[0];
            int minNum = array[0];
            int maxIndex = 0;
            int minIndex = 0;
            int sum = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i]>maxNum) {
                    maxNum = array[i];
                    maxIndex = i;
                }
                if (array[i]<minNum){
                    minNum = array[i];
                    minIndex = i;
                }
            }
            if (maxIndex>minIndex){
                for (int i = minIndex+1; i<maxIndex; i++){
                    sum += array[i];
                }
            } else {
                for (int i = maxIndex+1; i<minIndex; i++){
                    sum += array[i];
                }
            }
            System.out.println("Array of elements: " + Arrays.toString(array));
            System.out.println("Maximum array element is: " + "[" + maxNum + "]");
            System.out.println("Minimum array element is: "+ "[" + minNum + "]");
            System.out.println("The sum of the elements between the maximum and minimum element is " + sum);
    }
}