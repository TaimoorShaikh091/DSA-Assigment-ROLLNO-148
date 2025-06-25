import java.util.Stack;

public class ArrayReverser {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        reverseArray(numbers);
    }

    public static void reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int number : numbers) {
            stack.push(number);
        }

        // Pop elements back into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }

        // Display the reversed array
        System.out.print("Reversed Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
