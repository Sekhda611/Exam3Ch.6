//Write a Java method that takes in an array of integers and returns
// a new array containing only the even elements of the input array.
// The method should preserve duplicates as they appear in the input array.
//getEvenNumbers([-1, -2, -3, -4]) → [-2, -4]
//public int[] getEvenNumbers( int[] nums){}
package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class GetEvenNumber {
    public static void main(String[] args) {
        GetEvenNumber object  = new GetEvenNumber();
        int[] input = {1, 5, 6, 7, 3, 8};
        int[] result =  object.getEvenNumbers(input);
        System.out.println("The even number array is : " + Arrays.toString(result));

    }

    public int[] getEvenNumbers(int[] nums){


        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                //even[count] = nums[i];
                count++;
            }
        }
        int[] even = new int[count];
        int index = 0;
        for(int num : nums){
            if (num % 2 == 0){
                even[index] = num;
                index++;
            }
        }
        return even;
    }
}
