package chap06;
import java.util.Scanner;

public class ShellSort2 {
    // 셸 정렬
    static int shellSort(int[] arr, int nx) {
        int h;
        int cnt = 0;
        // 증분값 초기설정
        for(h = 1; h < nx / 9; h = h * 3 + 1)
            ;

        for( ; h > 0; h /= 3) // h(증분값)은 3배 + 1의 형태로 설정하기에 3으로 나눠준다. (버전 1은 2로 나눔)
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
