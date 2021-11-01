package chap01;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("a ="); int a = stdIn.nextInt();
        System.out.print("b ="); int b = stdIn.nextInt();
        System.out.print("c ="); int c = stdIn.nextInt();

        int median = a;

        if ( (b >= median && b <= c) || (b <= median && b >= c) )
            median = b;
        if ( (c >= median && c <= b) || (c <= median && c >= b) )
            median = c;
        
        System.out.println("중간값은 " + median + "입니다.");
    }
}
