package selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastSupportedIndex = intArray.length -1; lastSupportedIndex > 0; lastSupportedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastSupportedIndex; i++) {

                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }

            }
            swap(intArray, lastSupportedIndex, largest);
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
