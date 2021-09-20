package Exercise.chapter02;

class PrimeNumber2_02_10 {
    public static void main(String[] args) {
        int counter = 0;                // 나눗셈의 횟수
        int ptr = 0;                    // 찾은 소수의 개수
        int[] prime = new int[500];     // 소수를 저장하는 배열

        prime[ptr++] = 2;               // 2는 소수, 짝수는 소수에서 제외

        for (int n = 3; n <= 1000; n += 2) {   // 소수를 찾는 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) {         // 이미 찾은 소수로 나누어 봄
                counter++;
                if (n % prime[i] == 0) {        // 기존에 찾은 소수로 나누어떨어지는 경우, 소수가 아님
                    break;
                }
            }
            if (ptr == i) {             // 마지막까지 나눠떨어지지 않음 = 소수
                prime[ptr++]= n;       // 배열에 소수로 저장
            }
        }
        for (int i = 0; i < ptr; i++) { // 찾은 ptr개의 소수를 나타냄
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
