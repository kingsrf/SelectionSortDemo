import java.util.Arrays;


public class SelectionSortDemo {
    
    public static<T extends Comparable<? super T>> void selectionSort(T[] a) {
        int n = a.length;
        
        //Moves the boundary of the unsorted subarray from 0 to n-1
        for (int i = 0; i < n; i++) {
            // Assuming the minimum element is at index i
            int min = i;
            
            // Finds the true minimum element in the remainder of the array
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            
            // Swap the found min element into position 1
            T tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }
    
    public static void main(String[] args) {
        Integer[][] tests = {
            {3, 1, 4, 1, 5, 6, 9}, // random
            {1, 2, 3, 4, 5}, // already sorted - asc
            {5, 4, 3, 2, 1}, // descending order
            {3, 3, 3, 3, 3}, // all same
            {}, // empty
            {11} // single element
        };
        
        for (Integer[] arr : tests) {
            System.out.printf("Before: %-15s", Arrays.toString(arr));
            selectionSort(arr);
            System.out.println("After: " + Arrays.toString(arr));
        }
    }
}
