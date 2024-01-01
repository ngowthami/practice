/* Algorithm to Find the Largest Element in an Array
    1. Initialize the maximum:
        Start by initializing a variable 'max' to the first element of the array.
        Assume that the first element is the maximum.
    2. Iterate through the Array:
        Iterate through the array starting from the second element(index 1) to 
        the last element.
    3. Check and update
        For each element at the current index, compare it with the current value of 'max'.
        If the current value is greater than 'max', update 'max' with the value of the current element.
        If the current element is less than or equal to 'max', do nothing and continue to the next element.
    4. Continue Iteration:
        At the end of the iteration, the variable 'max' will hold the largest element in the array.
        



*/
import java.util.Scanner;

class ArrayUtils {
    static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = ArrayUtils.findLargestElement(arr);
        System.out.println("Largest element in the given array: " + largest);
    }
}
