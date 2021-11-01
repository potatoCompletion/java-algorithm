package chap03;
import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] x = {
            "abstract", "assert", "boolean"
        };

        System.out.print("원하는 키워드를 입력하시오 :");
        String key = stdIn.next();

        int idx = Arrays.binarySearch(x, key);

        if (idx < 0)
            System.out.println("해당 키워드는 없습니다.");
        else
            System.out.println("x[" + idx + "] = " + key);
    }
}
