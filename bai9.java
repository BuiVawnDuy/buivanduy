import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int multiply = 1;
        for (int i = 1; i <= n; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);
    }
}
