import java.util.Arrays;

public class 912_Sort_an_Array {
    public static void main(String[] args) {
        int arr[] = new int[] { 6, 5, 3, 1, 8, 7, 2, 4 };
        quickSortArray(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void InserttionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                    i--;
                }
            }
        }
    }

    public static void SelectionSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[min] < n[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int t = n[i];
                n[i] = n[min];
                n[min] = t;
            }
        }
    }