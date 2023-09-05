package bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastSupportedIndex = intArray.length -1; lastSupportedIndex > 0; lastSupportedIndex--) {
            for (int i = 0; i < lastSupportedIndex; i++) {
                if (intArray[i] > intArray[i+1]){
                    swap(intArray, i, i + 1);
                }
            }
        }
        Arrays.stream(intArray).forEach((System.out::println));

    }

    public static void swap(int[] arr, int i , int j){
        if (i == j) return;

        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

    }
}
