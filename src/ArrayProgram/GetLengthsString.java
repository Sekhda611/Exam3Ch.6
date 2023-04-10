package ArrayProgram;

import java.util.Arrays;

public class GetLengthsString {
    public static void main(String[] args) {
        String[] str = {"Sonal", "Tanvee", "Achyut", "Keshvee"};
        int length[] = getLengths(str);
        System.out.println("the length of tha array is : "  + Arrays.toString(length));
    }
    public static int[] getLengths(String[] str){
        int[] length = new int[str.length];
        for(int i =0; i < str.length; i++){

            length[i] = str[i].length();

        }
        return length;
    }
}
