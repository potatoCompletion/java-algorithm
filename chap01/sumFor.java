package chap01;
import java.util.Scanner;

public class sumFor {
    public static int sumOf(int a, int b) {
        int sum = 0;
        int high = a > b ? a : b;
        int low;

        for (low = a > b ? b : a; low <= high; low++) {
            sum += low;
        }

        return sum;  
    }
    public static void main(String[] args) {
        System.out.println(sumOf(5, 3));
    }
}