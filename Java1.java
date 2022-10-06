import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int j = 0;
        while (i < n){
            i++;
            j = n * 2 - i;
            while (j > 0){
                j--;
                System.out.print(' ');
            }
            j = 1;
            while (j < i * 2 - 1){
                j++;
                System.out.print('*');
            }
            System.out.println('*');
        }
        System.out.println(' ');
        i = 0;
        j = 0;
        while (i < n){
            i++;
            j = n - i;
            while (j > 0){
                j--;
                System.out.print(' ');
            }
            j = 1;
            while (j < i * 2){
                j++;
                System.out.print('*');
            }
            j = n * 2 - i * 2 + 1;
            while (j > 0){
                j--;
                System.out.print(' ');
            }
            j = 1;
            while (j < i * 2 - 1){
                j++;
                System.out.print('*');
            }
            System.out.println('*');
        }

    }
}
