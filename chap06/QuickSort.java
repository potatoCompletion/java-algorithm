package chap06;
import java.util.Scanner;

public class QuickSort {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void quickSort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2];

        do {
            while (arr[pl] < x)
                pl++;
            while (arr[pr] > x)
                pr--;
            if (pl <= pr)
                swap(arr, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(arr, left, pr);
        if (right > pl) quickSort(arr, pl, right);
    }

    static void quickSort2(int[] arr, int nx) {
        int pl = 0;
        int pr = nx - 1;
        int x = arr[nx / 2];

        do {
            while(arr[pl] < x)
                pl++;
            while(arr[pr] > x)
                pr--;
            if(pl <= pr)
                swap(arr, pl++, pr--);
        } while(pl <= pr);

        if(pr > 0) {
            int[] lArr = new int[pr + 1];
            for(int i = 0; i < pr + 1; i++) {
                lArr[i] = arr[i];
            }

            quickSort2(lArr, pr + 1);

            for(int i = 0; i < pr +1; i++) {
                arr[i] = lArr[i];
            }
        }

        if(pl < nx) {
            int[] rArr = new int[nx - pl];
            for(int i = 0; i < nx - pl; i++) {
                rArr[i] = arr[i];
            }

            quickSort2(rArr, nx - pl);
            
            for(int i = pl; i < nx; i++) {
                arr[i] = rArr[i];
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.print("arr[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        quickSort(arr, 0, nx - 1);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");
    }
}
