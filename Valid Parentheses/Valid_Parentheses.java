import java.util.*;

class Valid_Parentheses {

    String array[] = new String[100];
    boolean val = false;
    char stack[] = new Character(100);
    int top = -1;

    Valid_Parentheses() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the String: ");
        array = in.nextLine();
        val = isValid();
        display();
    }

    boolean isValid() {
        boolean valid = false;
        for (int i = 0; i < array.length; i++) {

        }
        return valid;
    }

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        if (top == -1) {
            return null;
        } else {
            return array[top--];
        }
    }

    void display() {
        System.out.println("The result is: " + val);
    }

    public static void main(String args[]) {
        Valid_Parentheses VP = new Valid_Parentheses();
    }

}