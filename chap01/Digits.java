package chap01;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;

        do {
            num = stdIn.nextInt();
        } while( (num < 10) || (num > 90));

        System.out.println(num);
    }
}
