package chap04;

public class IntAryQueue {
    private int max;
    private int num;
    private int[] que;

    public IntAryQueue() {
        num = 0;
        
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }
}
