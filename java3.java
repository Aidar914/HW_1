import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double left = 0;
        double right = n;
        double mid = (left + right) / 2;
        int i = 0;
        while (mid * mid != n & mid * mid + 0.000001 != n & mid * mid - 0.000001 != n){
            if (mid * mid > n){
                right = mid;
            }
            else{
                left = mid;
            }
            mid = (left + right) / 2;
            if (i > 10000){
                break;
            }
            i++;
        }

        System.out.print(mid);
    }
}
