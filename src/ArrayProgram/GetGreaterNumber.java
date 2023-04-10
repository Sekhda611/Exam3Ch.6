//Write a method that takes in a number and an array of integers and
// returns an array containing only the elements of the input array
// that are greater than the input number.
//getGreaterNumbers(0, [1, -2, 3, -4, 5]) → [1, 3, 5]
//
//public int[] getGreaterNumbers(int num, int[] arr){}

package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class GetGreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = input.nextInt();
        int[] addNum = { 1, 5, 7, 3, 4, 6};
        int[] result = getGreaterNumber(n, addNum);
        System.out.println("the output is: " + Arrays.toString(result));
    }
    public static int[] getGreaterNumber(int num, int[] arr){
        int count = 0;
        for(int i= 0; i< arr.length; i ++){
            if(arr[i] > num){
                count++;
            }
        }
        int index = 0;
        int[] greatNumber = new int[count];
        for(int i =0; i < arr.length; i++){
            if(arr[i] > num){
                greatNumber[index] = arr[i];
                index ++;
            }
        }
        return greatNumber;
    }
}
