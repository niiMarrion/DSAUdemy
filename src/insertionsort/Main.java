package insertionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstSupportedIndex = 1; firstSupportedIndex < intArray.length; firstSupportedIndex++) {
            int newElement = intArray[firstSupportedIndex];

            int i;
            for (i = firstSupportedIndex; i > 0 && intArray[i-1] > newElement ; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;

        }

        Arrays.stream(intArray).forEach(System.out::println);
    }
}
