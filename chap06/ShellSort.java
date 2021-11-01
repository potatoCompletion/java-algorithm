package chap06;
import java.util.Scanner;

public class ShellSort {
    static int shellSort(int[] arr, int nx) {
        int cnt = 0;

        for(int h = nx / 2; h > 0; h /= 2)
            for(int i = h; i < nx; i++) {
                int j;
                int tmp = arr[i];
                for(j = i - h; j >= 0 && arr[j] > tmp; j -= h) {
                    arr[j + h] = arr[j];
                    cnt++;
                }
                arr[j + h] = tmp;
            }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];
        int j = nx;

        for(int i = 0; i < nx; i++) {
            arr[i] = j;
            j--;
        }

        int cnt = shellSort(arr, nx);

        for(int i = 0; i < nx; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        System.out.println("cnt : " + cnt);
    }
}
