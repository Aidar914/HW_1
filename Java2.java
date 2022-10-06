import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int min = 0;
        int max = 0;
        if (k > m){
            min = m;
            max = k;
        }
        if (k <= m){
            min = k;
            max = m;
        }
        while (min <= max){
            if (min % 3 == 0){
                System.out.print(min);
                System.out.print(' ');
            }
            min++;
        }

    }
}
