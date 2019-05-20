import java.util.*;

class Palindrome_Number {

    int number = 0;
    boolean result;

    Palindrome_Number() {
        System.out.println("\nEnter the Number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        result = plaindrome_check();

    }

    boolean plaindrome_check() {
        int LastHalf = 0;
        if (number < 0 || (number % 10 == 0 && number != 0))
            return false;
        while (number > LastHalf) {
            LastHalf = LastHalf * 10 + number % 10;
            number /= 10;
        }
        return (number == LastHalf || number == LastHalf / 10);
    }

    void display() {
        if (result == true)
            System.out.println("The number is a Palindrome");
        else
            System.out.println("The number is not a Palindrome");

    }

    public static void main(String args[]) {
        Palindrome_Number PN = new Palindrome_Number();
        PN.display();

    }
}