package com.example.sorting;




public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {


        // TODO implement Gnome Sort here
        int pos = 0;
        while (pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0) {
                pos++;
            } else {
                // Swap data[pos] and data[pos-1]
                T temp = data[pos];
                data[pos] = data[pos - 1];
                data[pos - 1] = temp;
                pos--;
            }
        }
    }





    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {

        // TODO implement Cocktail Shaker Sort here
        boolean swapped;
        do {
            swapped = false;
            // Forward pass
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    // Swap data[i] and data[i+1]
                    T temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the list is already sorted
            if (!swapped) {
                break;
            }

            // Backward pass
            swapped = false;
            for (int i = data.length - 1; i > 0; i--) {
                if (data[i].compareTo(data[i - 1]) < 0) {
                    // Swap data[i] and data[i-1]
                    T temp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }



    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





