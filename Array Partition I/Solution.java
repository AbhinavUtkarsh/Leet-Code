import java.util.*;
import java.util.Arrays;

public class Solution {
    Scanner sc = new Scanner(System.in);

    Solution() {
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();        // taking in the number of elements
        int[] array = new int[size];
        System.out.println("Enter the elements one by one: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();        // taking in the array itself
        }
        Arrays.sort(array);             // sorting the array
            int sum = 0;            // out counter

        for (int i = 0; i < array.length - 1; i += 2) {     // looping the array by skipping a element in between
            sum += Math.min(array[i], array[i + 1]);        // finding the min of a pair and adding it up to the counter
        }
        System.out.println("The result is: ");
        System.out.println(sum);                // displaying the result
    }

    public static void main(String args[]) 
    {
        Solution S = new Solution();
    }
}
    
     
    
    

        
    