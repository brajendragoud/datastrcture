package com.green.arrays;

import java.util.HashSet;
import java.util.Set;


/**
 * Duplication in an Array
 * An array contains n numbers ranging from 0 to n-2. There is exactly one number duplicated in
 * the array. How do you find the duplicated number? For example, if an array with length 5 contains numbers {0, 2,
 * 1, 3, 2}, the duplicated number is 2.
 * @author win7
 *
 */
public class A_001_Duplication {
    public static void main(String[] args) {
        int[] intArr = { 0, 2, 1, 3, 2 };
        Set<Integer> intSet = new HashSet<Integer>();

        for (int i = 0; i < intArr.length; i++) {
            if (intSet.contains(intArr[i])) {
                System.out.println("Duplicate number is " + intArr[i]);
            } else {
                intSet.add(intArr[i]);
            }
        }
    }
}
