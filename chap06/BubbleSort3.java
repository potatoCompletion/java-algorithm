package chap06;
import java.util.Scanner;

public class BubbleSort3 {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void bubbleSort(int[] arr, int nx) {
        int k = 0;

        while(k < nx - 1) {
            int last = nx - 1;
            for(int j = nx - 1; j > k; j--)
                if(arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    last = j;
                }
            k = last;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("arr[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        bubbleSort(arr, nx);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");
    }
}
