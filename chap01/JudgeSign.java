package chap01;
import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a = "); int a = stdIn.nextInt();
        
        if (a > 0)
            System.out.println("이 수는 양수입니다.");
        else if (a < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
    }
}
