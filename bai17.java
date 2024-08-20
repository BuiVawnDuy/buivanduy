import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            double xPower = Math.pow(x, i);
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            result += xPower / factorial;
    }
        System.out.println(result);
}
}
