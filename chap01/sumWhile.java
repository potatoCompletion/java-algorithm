package chap01;
import java.util.Scanner;

public class sumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("num = "); int num = stdIn.nextInt();
        int count = 0;
        int sum = 0;

        while(count < num) {
            count++;
            sum += count;
        }
        
        System.out.println("sum = " + sum);
    }
}
