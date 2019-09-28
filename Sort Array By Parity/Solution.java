import java.util.*;

class Solution {
    Solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); // taking the size input
        System.out.println("Enter the elements one by one: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); // taking in the array
        }
        int[] dummy = new int[n]; // creating a dummy array for storage of rearranged elements
        int even_index = 0; // index for the even elements from the start
        int odd_index = n - 1; // index for the odd elements from the end
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) { // finding the even elements
                dummy[even_index] = array[i];// copying the element
                even_index++;
            } else { // declaring them odd
                dummy[odd_index] = array[i]; // copying the element
                odd_index--;
            }

        }
        System.out.println("The array in rearranged format is: ");
        for (int i : dummy) { // resultant array
            System.out.print(i + " ");
        }

    }

    public static void main(String args[]) {
        Solution S = new Solution();
    }
}