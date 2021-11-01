package chap03;
import java.util.Scanner;

public class SeqSearchSen {
    static int seqSearchSen(int[] a, int key) {
        a[a.length - 1] = key;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하시오 :");
        int size = stdIn.nextInt();

        int[] arr = new int[size + 1];

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = stdIn.nextInt();
        }

        System.out.print("찾고 싶은 수를 입력하시오 :");
        int ky = stdIn.nextInt();

        int result = seqSearchSen(arr, ky);

        if (result == -1) 
            System.out.println("요소가 배열에 없습니다.");
        else 
            System.out.println(ky + "는 arr[" + result + "]에 있습니다.");
    }
}
