package Sorting;

import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
        System.out.println("Sorted using Quick Sort: " + numbers);
    }

    private void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi - 1); // Recursively sort left part
            quickSort(list, pi + 1, high); // Recursively sort right part
        }
    }

    private int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high); // Pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) < pivot) {
                i++;
                // Swap list[i] and list[j]
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        // Swap list[i+1] and list[high] (pivot)
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }
}
