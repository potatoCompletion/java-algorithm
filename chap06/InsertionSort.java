package chap06;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr, int nx) {
        for(int i = 1; i < nx; i++) {
            int j;
            int temp = arr[i];
            for(j = i; j > 0 && arr[j - 1] > temp; j--)
                arr[j] = arr[j - 1];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("arr[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        insertionSort(arr, nx);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");
    }
}
