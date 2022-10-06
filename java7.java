import java.util.Scanner;
public class First
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = "";
        int k = 0;
        for (int i = 0; i < n; i++){
            number = in.next();
            int bool = 1;
            for (int j = 1; j < number.length(); j++){
                if (number.charAt(j) >= number.charAt(j - 1)){
                    bool = 0;
                    break;
                }
            }
            if (bool == 1){
                k++;
            }
        }
        if (k == 3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
