package Exercise.chapter02;

public class MaxOfArray_02_04 {
    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        
    }
}
