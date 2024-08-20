import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = 0;
        double current = x;
        for (int i = 1; i <= n; i++) {
            result += current;
            current *= x;
        }
        System.out.println(result);
    }
}
