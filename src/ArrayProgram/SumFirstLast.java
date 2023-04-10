//Write a Java method that takes in an array of integers and
// returns the sum of the first and last elements of the input array.
// If the input array is empty, the method should return 0.
//sumFirstAndLast([0, -2, 5, 9, 1]) → 1
//
//public int sumFirstAndLast( int[] nums){}
package ArrayProgram;

public class SumFirstLast {
    public static void main(String[] args) {
        int [] input = { 5, 6, 8, 4, 2};
        int result = sumFirstLast(input);
        System.out.println("The sum is: " + result);
    }
    public static int sumFirstLast( int[] nums){
        int sum = nums[0] + nums[nums.length - 1];
        return sum;
    }
}
