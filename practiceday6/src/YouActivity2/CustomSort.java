package YouActivity2;

import java.util.Scanner;

public class CustomSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum element in the array
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        // Create and initialize the brr array with zeros
        int[] brr = new int[max + 1];

        // Calculate the frequency of each element in arr and store in brr
        for (int element : arr) {
            brr[element]++;
        }

        // Calculate the cumulative addition of elements in brr
        for (int i = 1; i <= max; i++) {
            brr[i] += brr[i - 1];
        }

        // Create and initialize the crr array to store the sorted elements
        int[] crr = new int[arr.length];

        // Sort the elements based on brr and store in crr
        for (int i = arr.length - 1; i >= 0; i--) {
            int element = arr[i];
            crr[brr[element] - 1] = element;
            brr[element]--;
        }

        // Print the sorted array crr
        System.out.println("Sorted array:");
        for (int element : crr) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
