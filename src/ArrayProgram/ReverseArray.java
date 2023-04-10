//Write an instance method in Java called reverseArray
// that takes in an array of integers as a parameter and returns
// a new array with the elements in reverse order.
//reverseArray([1, 2, 3, 4, 5]) → [5, 4, 3, 2, 1]
package ArrayProgram;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = reverseArray(input);
        System.out.println("The reverse array is: " + Arrays.toString(result));
    }
    public static int[] reverseArray( int[] nums){
        int[] reverse = new int[nums.length];
        int index = 0;
        for(int i = nums.length -1; i >= 0; i --){
            reverse[index] = nums[i];
            index ++;
        }
        return reverse;
    }
}
