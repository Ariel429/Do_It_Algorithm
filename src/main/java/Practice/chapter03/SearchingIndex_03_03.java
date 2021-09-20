package Practice.chapter03;

import java.util.Scanner;

// 우항을 좌항에 넣는다, = 는 대입의 개념임을 항상 기억!!

public class SearchingIndex_03_03 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int matchCount = 0;     // key 와 일치한 요소의 개수
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
//                i = idx[matchCount++];
                idx[matchCount++] = i;
            }
        }
        return matchCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] array = new int[num];         // 요솟수가 num개인 배열
        int[] matchedArray = new int[num];  // key와 일치한 idx를 담을 배열(num개 만큼 일치할 수 있으므로 num개)

        for (int i = 0; i < num; i++) {
            System.out.print("array[" + i + "]: ");
            array[i] = scanner.nextInt();   // 배열을 입력받음
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int matchedCount = searchIdx(array, num, key, matchedArray);

        if (matchedCount == 0) {
            System.out.println("검색한 값과 일치하는 요소가 없습니다.");
        } else {
            for (int i = 0; i < matchedCount; i++) {
                System.out.println("검색한 값은 " + "array[" + matchedArray[i] + "]에 있습니다.");
            }
        }
    }
}
