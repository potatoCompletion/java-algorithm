package chap06;
import java.util.Scanner;

public class BubbleSortQ1 {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void bubbleSort(int[] arr, int nx) {
        for(int i = nx - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("a[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        bubbleSort(arr, nx);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");
    }
}
