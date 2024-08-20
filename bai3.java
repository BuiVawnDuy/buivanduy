import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double Sum = 0.0;
        for (int i = 1; i <= n; i++ ){
            Sum += 1.0 /i ;
        }System.out.println("Sum = " + Sum );
    }
}
