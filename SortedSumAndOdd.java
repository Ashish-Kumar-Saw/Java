package collegeWallah.Array;

import java.util.Scanner;

public class SortedSumAndOdd {

    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
     static void reverse (int[]arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            Swap(arr,i,j);
            i++;
            j--;
        }
     }
    static void Swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void SortedArrayByParity(int []arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                Swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1) {
                right--;
            }

        }

    }

    static  int[] sortSquares(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int []ans = new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

         reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter Array Size:-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter "+n+" Element in ascending :-");
        int []arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Original Array:-");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

       int []ans = sortSquares(arr);
        System.out.println("Sorted Squares:-");

        PrintArray(ans);

    }
}
