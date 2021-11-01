package chap02;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a) {
        int idx1 = 0;
        int idx2 = a.length - 1;
        int temp;
        for (idx1 = 0; idx1 < a.length / 2; idx1++) {
            temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;

            idx2--;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 :");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        swap(a);

        System.out.println("요소를 역순으로 정렬했습니다.");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
