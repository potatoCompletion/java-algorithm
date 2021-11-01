package chap02;
import java.util.Scanner;

public class MaxOfArray {
    public static int MaxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = stdIn.nextInt();
        }
        
        System.out.println("가장 큰 키 : " + MaxOf(a));
        
    }
}