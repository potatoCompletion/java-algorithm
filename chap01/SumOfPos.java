package chap01;
import java.util.Scanner;

public class SumOfPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            num = stdIn.nextInt();
        }while(num <= 0);

        for(int i = 1; i <= num; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
