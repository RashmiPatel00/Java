import java.util.*;
public class MyClass{
    private static void toggle(int []arr, int k){
       int n= arr.length;
        for(int i=k;i<n;i++){
        if(arr[i]==0)
            arr[i]=1;
        else{
            arr[i]=0;
        }
    }
    for(int i:arr){
        System.out.print("Toggle Phase"+i);
        System.out.println();
    }
    }
private static int togglecount(int[]arr){
    int count=0;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            toggle(arr,i);
            count++;
        }
    }

    return count;
    
}

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     System.out.println("Count"+togglecount(arr));


    }
}