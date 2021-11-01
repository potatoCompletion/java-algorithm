package chap02;
import java.util.Scanner;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("a 배열의 요소 수 : ");
        int numOfArray1 = stdIn.nextInt();
        int[] a = new int[numOfArray1];

        System.out.print("b 배열의 요소 수 : ");
        int numOfArray2 = stdIn.nextInt();
        int[] b = new int[numOfArray2];

        for (int i = 0; i < numOfArray1; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = 0; i < numOfArray2; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("a 배열과 b 배열은 같다 ? " + equals(a, b));
    }
}
