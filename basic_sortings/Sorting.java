import java.util.*;

public class Sorting {
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]);
                }
            }
        }
    }

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 1, 2, 3 };
        // bubble_sort(arr);
        selection_sort(arr);
        System.err.println(Arrays.toString(arr));
    }
}