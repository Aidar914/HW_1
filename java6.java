import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d = (b * b - a * c * 4);
        if (d < 0){
            System.out.println("нет решения");
        }
        if (d == 0){
            double x = (-1 * b) / (a * 2);
            System.out.println("x = " + x);
        }
        if (d > 0){
            double x1 = ((-1 * b) - Math.sqrt(d)) / (a * 2);
            double x2 = ((-1 * b) + Math.sqrt(d)) / (a * 2);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
