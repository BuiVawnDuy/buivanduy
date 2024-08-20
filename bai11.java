import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1.0;
        double giaiThua = 1.0;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
            sum += 1.0/giaiThua;
        }
        System.out.println(sum);
    }
}
