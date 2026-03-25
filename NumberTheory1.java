import java.util.*;

public class NumberTheory1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number");
        int n= sc.nextInt();
        int[]prime= new int[10];
        int k=0;
        prime[k++]=2;
        while(n%2==0){
            n=n/2;
        }
        for(int i=3;i<=n;i=i+2){
            while(n%i==0){
                n=n/i;
            }
            prime[k++]=i;
        }
        for(int p: prime){
            System.out.println(p);
        }
    }
}
