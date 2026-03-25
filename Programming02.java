import java.util.*;
public class Programming02 {

   private static int[][] matrixSum(int[][]arr1, int[][]arr2){
    int[][]ans= new int[arr1[0].length][arr2.length];

   for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
        ans[i][j]= arr1[i][j] +arr2[i][j];
    }
   }
    return ans;
   }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int [][]arr1= new int[n1][n2];
        
       // System.out.println("SubString"+ substring(arr1, arr2));
       for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            arr1[i][j]=sc.nextInt();
        }
       }
        int [][]arr2= new int[n1][n2];
        
       // System.out.println("SubString"+ substring(arr1, arr2));
       for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            arr2[i][j]=sc.nextInt();
        }
       }
        matrixSum(arr1, arr2);
    

}
    
}
