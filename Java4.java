import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n){
            i++;
            k = 0;
            while (k * k + (n - i) * (n - i) < n * n){
                k++;
            }
            j = 0;
            while (n - k > j){
                j++;
                System.out.print('+');
            }
            j = 0;
            while (k * 2 > j){
                j++;
                System.out.print('O');
            }
            j = 0;
            while (n - k > j){
                j++;
                System.out.print('+');
            }
            System.out.println(' ');
        }
        while (i > 1){
            i--;
            k = 0;
            while (k * k + (n - i) * (n - i) < n * n){
                k++;
            }
            j = 0;
            while (n - k > j){
                j++;
                System.out.print('+');
            }
            j = 0;
            while (k * 2 > j){
                j++;
                System.out.print('O');
            }
            j = 0;
            while (n - k > j){
                j++;
                System.out.print('+');
            }
            System.out.println(' ');
        }
    }
}
