import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = (1 + (i * 2)) * (int)(Math.pow(-1, i));
            System.out.println(a[i]);
        }
    }
}
