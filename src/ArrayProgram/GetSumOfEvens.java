//Write a Java method called getSumOfEvens that
// takes an integer array as input and returns the sum of all even integers in the array.
package ArrayProgram;

public class GetSumOfEvens {
    public static void main(String[] args) {
        int[] nums ={5, 3, 8, 6, 10};
        int result = getSumOfEven(nums);
        System.out.println("the sum is: " + result);
    }
    public static int getSumOfEven(int[] nums){
        int sum = 0;
        for(int i =0; i < nums.length; i++){
            if (nums[i]  % 2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
}
