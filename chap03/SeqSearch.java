package chap03;
import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 :");
        int num = stdIn.nextInt();
        int[] nList = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("nList[" + i + "] :");
            nList[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 :");
        int key = stdIn.nextInt();

        if (seqSearch(nList, num, key) == -1)
            System.out.println("해당 값은 존재하지 않습니다.");
        else
            System.out.println("해당 값은 nList[" + seqSearch(nList, num, key) + "] 에 위치합니다.");
    }
}
