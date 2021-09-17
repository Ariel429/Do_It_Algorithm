package Exercise.chapter02;

public class Conversion_02_08 {

    static double convR(int x, int[] d) {
        double result = 0;
        double jari = 0;
        do {
            result += Math.pow(10.0, jari) * (x % 2); // 100 * (1 % 2)
            x /= 2;  // 1/2 = 0
            jari++;
        } while (x != 0);
        return result;
    }

    public static void main(String[] args) {
        int[] printResult = new int[6];
        double result = convR(15, printResult);

        System.out.println(result);
    }
}
