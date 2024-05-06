package collegeWallah.Array;

import java.util.Scanner;

public class SortedArrayZeroAndOne {

    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

    static void sortZeroAndOne(int arr[]){
        int left = 0;
        int right =arr.length- 1;
        while (left<right){
            if(arr[left]==1 && arr[right]==0){
               swap(arr,left,right);
               right--;
               left++;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Array size:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in 0&1");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("sorted Zero and One");
        sortZeroAndOne(arr);
       PrintArray(arr);
    }
}
