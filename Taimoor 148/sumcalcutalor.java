public class SumCalculator {
    public static void main(String[] args) {
        int[] values = {5, 10, 15, 20, 25};
        int totalSum = calculateSum(values, values.length);
        System.out.println("Total Sum of array elements: " + totalSum);
    }

    public static int calculateSum(int[] values, int length) {
        // Base case: if the length is 0
        if (length == 0) {
            return 0;
        }
        // Recursive case: last element + sum of the rest
        return values[length - 1] + calculateSum(values, length - 1);
    }
}
