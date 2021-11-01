package chap02;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[3];

        b = a.clone();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
