package chap06;
import java.util.Scanner;

public class Partition {
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void partition(int[] arr, int nx) {
        int pl = 0;
        int pr = nx - 1;
        int x = arr[nx / 2];

        do {
            while (arr[pl] < x) {
                pl++;
            }
            while (arr[pr] > x) {
                pr--;
            }
            if(pl <= pr)
                swap(arr, pl++, pr--);
        } while (pl <= pr);

        System.out.println("피벗의 값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i <= pl - 1; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i = pr + 1; i <= pl - 1; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < nx; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : "); int nx = stdIn.nextInt();
        int[] arr = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("arr[" + i + "] = "); arr[i] = stdIn.nextInt();
        }

        partition(arr, nx);
    }
}
