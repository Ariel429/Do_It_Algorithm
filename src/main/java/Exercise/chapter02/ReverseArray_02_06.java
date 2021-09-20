package Exercise.chapter02;

import java.util.Scanner;

public class ReverseArray_02_06 {

    // 배열 요소 idx1 과 idx2의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a 요소를 역순 정렬
    // a.length = 5
    // 0 1 2 3 4
    // 인덱스 0 -> 4로 이동 5-0-1 = 4
    // 인덱스 1 -> 3로 이동 5-1-1 = 3

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt(); // 요솟수

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        // 배열 a 요소를 역순으로 정렬
        reverse(x);
        System.out.println("요소를 역순으로 정렬했습니다.");

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }
}
