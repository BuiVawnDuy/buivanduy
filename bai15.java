import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0;

        for (int i = 1; i <= n; i++) {
            double partialSum = 0;
            for (int j = 1; j <= i; j++) {
                partialSum += j;
        }
        result += 1.0/partialSum;
        }
        System.out.println(result);
    }
}
