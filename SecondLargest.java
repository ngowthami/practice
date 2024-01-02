
// Algorithm to find the second largest element in the given array:

// 1. Start by initializing a variable 'max' to the first element of the array.
// 2. Assume that the first element is the maximum. Then declare another variable 'sMax' with the value -1.
// 3. Iterate through each element in the array.
//     a. Check if the current element is greater than 'max'.
//         i. If true:
//             - Assign the previous maximum element to 'sMax'.
//             - Update 'max' with the current element.
//     b. If the current element is not equal to 'max' and is greater than 'sMax':
//         - Update 'sMax' with the current element.
// 4. Continue this iteration for all the elements in the given array.
// 5. The value in 'sMax' at the end of the iteration is the second largest element in the array.

import java.util.Scanner;

public class SecondLargest {
    static int findSecondLargest(int arr[]){
        int max = arr[0];
        int sMax = -1;
        for(int i = 0; i < arr.length; i ++){
            if(max < arr[i]){
                sMax = max;
                max = arr[i];
            } else if(max != arr[i] && arr[i] > sMax){
                sMax = arr[i];
            }
        }
        return sMax;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i ++){
            arr[i] = s.nextInt();
        }
        int secondMax = findSecondLargest(arr);
        System.out.println(secondMax);
    }
}