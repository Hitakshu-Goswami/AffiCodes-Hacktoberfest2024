import java.util.*;
import java.util.Random;

public class insertionsort {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int size = 1000;
        long start, end;
        double c;

        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(1000);
        }
        start = System.nanoTime();
      //  int arr[] = {13, 46, 24, 52, 20, 9};
        int n = a.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        insertion_sort(a, n);
        end = System.nanoTime();

        c = (double) (end - start);
        System.out.println("Insertion sort");
        System.out.println("Time:" + c);
        System.out.println("Sorted data");
    }

}
