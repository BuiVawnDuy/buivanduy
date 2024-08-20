import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            double partialSum = 0;
            for (int j = 1; j <= i; j++) {
                partialSum += j;

            }result +=  Math.pow(x, i)/partialSum;
        }
        System.out.println(result);
    }
}
