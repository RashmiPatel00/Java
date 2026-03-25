import java.util.*;
class Programming01{

    private static int sumOfArray(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    private static double meanOfArray(int []arr){
       int ans=0;
       for(int i=0;i<arr.length;i++){
        ans+=arr[i];
       }
       
        return (double) ans/arr.length;
    }
    private static int largest(int[]arr){
        int largest= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        return largest;
    }

    private static void reverseOnSame(int[]arr){
        int p=0;
        int q= arr.length-1;
        while(p<q){
            int temp=arr[p];
            arr[p]=arr[q];
            arr[q]= temp;
            p++;
            q--;
        }
        System.out.println("Reverse On Same Array" );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int[] reverseNew(int[]arr){
        int k=0;
        int[]reverse = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            reverse[k++]=arr[i];
        }
        return reverse;
    }
    public static int[] removeduplicate(int[]arr){

        //[6,4,8,1,1,7] ootput-> [1,4,6,8,7]
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int[]result=new int[hs.size()];
        int index=0;
        for(int num:hs){
            result[index++]=num;
        }
        return result;
    }
    public static int[] removeduplicateinsameorder(int[]arr){
        Set<Integer> set= new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int []result= new int[set.size()];
        int idx=0;

        for(int num:set){
            result[idx++]=num;
        }
return result;
    }
    public static int removesortduplicate(int[]arr){
        int p=0;
        for(int i=1;i<arr.length;i++){
            if(arr[p]!=arr[i]){
                p++;
            arr[p]=arr[i];
        }
        }
        return p+1;
    }
private static boolean sorted(int[]arr){
    int p=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[p])return false;

        p++;
    }
    return true;
}

private  static int maxConsecutiveBit(int[]arr){
    int count=1;
    int maxcount=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            count++;
       maxcount = Math.max(count,maxcount);
        }
        else{
            count=1;
        }
    }
    return maxcount;
}
public static int secondLargest(int[]arr){
 int largest= Integer.MIN_VALUE;
 int second= Integer.MIN_VALUE;
 for(int num:arr){
    if(num>largest){
        second=largest;
        largest=num;
    }
    else if(num>second && num!=second ){
        second=num;
    }
 }
 return second;

}

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total number of array");
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Sum of Array"+ sumOfArray(arr));
        System.out.println("Mean of array"+ meanOfArray(arr));
        System.out.println("Largest element in Array"+ largest(arr));
        reverseOnSame(arr);
        System.out.println("Reverse on new Array");
      //  int[] rev= reverseNew(arr);
     //   System.out.println("Remove Duplicate from array"+duplicat(arr));
        System.out.println("check array is sorted or not"+sorted(arr));
        System.out.println("Maximum Consecutive Bit"+ maxConsecutiveBit(arr));
        System.out.println("Second Largest element"+ secondLargest(arr));

    }
}