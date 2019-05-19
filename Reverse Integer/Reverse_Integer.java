import java.util.*;

class Reverse_Integer {
    int number = 0;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("\nEnter the number: ");
        number = sc.nextInt();
    }

    int reverse() {

        int newnumber = 0;

        while (number != 0) {

            if (newnumber > Integer.MAX_VALUE / 10 || (newnumber == Integer.MAX_VALUE / 10 && number % 10 > 7))
                return 0;
            if (newnumber < Integer.MIN_VALUE / 10 || (newnumber == Integer.MIN_VALUE / 10 && number % 10 < -8))
                return 0;
            newnumber = 10 * newnumber + number % 10;
            number = number / 10;
        }
        return newnumber;
    }

    void display() {
        System.out.println("\nThe result is: " + reverse());
    }

    public static void main(String args[]) {
        Reverse_Integer RI = new Reverse_Integer();
        RI.input();
        RI.display();

    }
}
