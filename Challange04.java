
//Converting Decimal Number into Binary
import java.util.Scanner;
public class Challange04 {
    public static void main(String[] args) {
        System.out.print("Repo Test");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Decimal number");
        int a =sc.nextInt();
        while(a!=0){
            int r=a%2;
            a=a/2;
            System.out.print(r);
        }

sc.close();
    }
}
