package Practice.chapter01;

import java.util.Scanner;

public class SumOf_01_09 {
    static int sumof(int a, int b)  {
        int range_min;
        int range_max;

        if (a < b) {
            range_min = a;
            range_max = b;
        } else {
            range_min = b;
            range_max = a;
        }

        int sum = 0;
        for (int i = range_min; i <= range_max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a와 b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환한다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        System.out.println("정수 a와 b를 포함하여 그 사이의 모든 정수의 합= " + sumof(a,b));
    }
}
