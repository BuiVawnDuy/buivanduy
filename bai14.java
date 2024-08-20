import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = 0.0;
        double current = x ;
        for(int i = 0 ; i < n ; i++){
            result += current;
            current *= x*x;
        }
        System.out.println(result);
    }

}
