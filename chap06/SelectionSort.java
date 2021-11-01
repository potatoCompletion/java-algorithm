package chap06;
import java.util.Scanner;

public class SelectionSort {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void selectionSort(int[] arr, int nx) {
        for(int i = 0; i < nx - 1; i++) {
            int min = i;
            for(int j = i + 1; j < nx; j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            if(min != i)
                swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx  = stdIn.nextInt();
        int[] arr = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("arr[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        selectionSort(arr, nx);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");
    }
}
