import java.util.*;

class Sort_Integers_by_The_Number_of_1_Bits {
    public int[] sortByBits(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int c1 = Integer.bitCount(arr[i]);
                int c2 = Integer.bitCount(arr[j]);

                if (c1 > c2 || (c1 == c2 && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}