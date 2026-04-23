package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Utility class demonstrating different algorithms
 * to reverse an array in Java.
 *
 * This class includes:
 * 1. Reverse using two-pointer (while loop) approach  ⭐ BEST METHOD
 * 2. Reverse using temporary array
 * 3. Reverse using Java built-in Collections.reverse()
 *
 * Each method demonstrates different tradeoffs between
 * time complexity and space complexity.
 */
public class ReverseArray {

    /**
     * Reverses an array using the Two-Pointer technique.
     *
     * Algorithm:
     * Swap first element with last element,
     * second element with second-last element,
     * and continue until pointers meet.
     *
     * Example:
     * Input  : [1,2,3,4,5]
     * Output : [5,4,3,2,1]
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     *
     * Why this is the BEST method:
     * ✔ No extra memory required
     * ✔ Fast and efficient
     * ✔ Most commonly asked in interviews
     * ✔ Works in-place
     */
    public static void reverseArraysUsingWhileLoop() {

        int array[] = {1, 2, 3, 4, 5};

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed using while loop (Best Method): "
                + Arrays.toString(array));
    }

    /**
     * Reverses an array using an additional temporary array.
     *
     * Algorithm:
     * Create a new array and copy elements from
     * original array in reverse order.
     *
     * Example:
     * Input  : [1,2,3,4,5]
     * Output : [5,4,3,2,1]
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     *
     * Drawback:
     * ❌ Requires extra memory
     *
     * When to use:
     * ✔ When original array should remain unchanged
     */
    public static void reverseUsingTemporaryArray() {

        int array[] = {1, 2, 3, 4, 5};

        int reversedArray[] = new int[array.length];

        int length = array.length;

        for (int i = 0; i < length; i++) {

            reversedArray[i] = array[length - i - 1];
        }

        System.out.println("Reversed using temporary array: "
                + Arrays.toString(reversedArray));
    }

    /**
     * Reverses an array using Java Built-in method:
     * Collections.reverse()
     *
     * Note:
     * Works only with wrapper class Integer[]
     * NOT primitive int[]
     *
     * Steps:
     * Convert array to List
     * Reverse list using Collections.reverse()
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     *
     * When to use:
     * ✔ Production code
     * ✔ Clean and readable solution
     *
     * Avoid using in:
     * ❌ Coding interviews (unless allowed)
     */
    public static void reverseUsingBuiltInMethod() {

        Integer array[] = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(array);

        Collections.reverse(list);

        System.out.println("Reversed using built-in method: "
                + list);
    }

    /**
     * Main method to execute all reverse array algorithms.
     *
     * Calls:
     * 1. Two-pointer approach
     * 2. Temporary array approach
     * 3. Built-in method approach
     */
    public static void main(String[] args) {

        reverseArraysUsingWhileLoop();

        reverseUsingTemporaryArray();

        reverseUsingBuiltInMethod();
    }
}