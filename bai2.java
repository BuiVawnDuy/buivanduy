import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;
        for(int i= 1; i <= n; i++){
            Sum += i*i;
        }System.out.println("Tong so la : "+ Sum);
    }
}
