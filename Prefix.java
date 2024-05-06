package collegeWallah.Array;

import java.util.Scanner;

public class Prefix {

    static void PrintArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int [] PrefixSumArray(int[]arr){
        for(int i=1;i<arr.length;i++){
            arr[i]= arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.print("Enter Array Size:-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr = new int[n+1];
        System.out.print("Enter "+n+" Element:-");
        for(int i=1;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Input Array is :-");
        PrintArray(arr);
        int []prefSum = PrefixSumArray(arr);
        System.out.println();
        System.out.println("enter no. queries");
        int q = in.nextInt();
        while(q-- > 0){
            System.out.println("Enter range :");
            int l = in.nextInt();
            int r = in.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("sum "+ans);
        }

    }
}
