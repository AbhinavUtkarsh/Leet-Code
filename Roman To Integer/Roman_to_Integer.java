import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Roman_to_Integer {

    String roman;
    int number = 0;

    Roman_to_Integer() {
        System.out.println("Enter the Roman Number: ");
        Scanner sc = new Scanner(System.in);
        roman = sc.nextLine();
        number = romanToInt();
    }

    int romanToInt() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = roman.length();
        int number = map.get(roman.charAt(length - 1));
        for (int i = length - 2; i >= 0; --i) {
            if (map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {
                number -= map.get(roman.charAt(i));
            } else {
                number += map.get(roman.charAt(i));
            }
        }
        return number;

    }

    void display() {
        System.out.println("\nThe Integer equivalent of the given number is: " + number);
    }

    public static void main(String args[]) {
        Roman_to_Integer RI = new Roman_to_Integer();
        RI.display();
    }
}
