import java.util.Scanner;
public class First
{
    public static void j(int[] a){
        int num = 0;
        for (int i = 0; i < a.length; i++){
            num += a[i];
            num *= 10;
        }
        num /= 10;
        System.out.println(num);
    }
    public static void main(String[] arg) {
        int[] n = new int[] {1, 2, 3, 4, 5, 6, 7};
        j(n);
    }
}
