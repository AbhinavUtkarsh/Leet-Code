import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Two_Sum {

    int n;
    static int nums[] = new int[100];
    static int target;

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);

        }
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (map.containsKey(pair) && map.get(pair) != i) {
                System.out.println("The index of the result is: " + i + " " + map.get(pair));
                return new int[] { i, map.get(pair) };
            }
        }

        throw new IllegalArgumentException("No pairs Found");

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of elements of the array: ");
        n = sc.nextInt();
        System.out.println("\nEnter the elements of array one by one: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum: ");
        target = sc.nextInt();

    }

    public static void main(String args[]) {
        Two_Sum TS = new Two_Sum();
        TS.input();
        TS.twoSum(nums, target);
    }

}