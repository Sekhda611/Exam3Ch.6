//Write a Java method that takes in an array of strings
// and returns the longest string in the array.
// If there are multiple strings with the same length,
// the method should return the last string with that length.
package ArrayProgram;

public class GetLongestString {
    public static void main(String[] args) {
        String[] sc = {"how are you", "Hello", "oh my god", "I am very good", "We blessed"};
        String result = getLongestString(sc);
        System.out.println("the longest String is: " + result);

    }
    public static String getLongestString(String[] str){
        String longest ="";
        for (int i =0; i< str.length; i++){
            if(str[i].length() >= longest.length() ){
                longest = str[i];
            }
        }
        return longest;
    }

}
