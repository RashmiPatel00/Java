import java.util.Scanner;

public class minmax {

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > largest) {
                second = largest;
                largest = val;
            } else if (val > second && val != largest) {
                second = val;
            }
        }

        return second;
    }

    public static void rev(int[] arr) {
        int i = 0;
        int p = arr.length - 1;

        while (i < p) {
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
            i++;
            p--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Largest: " + secondLargest(arr));

        rev(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}