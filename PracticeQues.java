package collegeWallah.Array;

import java.util.Scanner;

public class PracticeQues {

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int FindSecondMax(int[]arr){
        int max = findMax(arr);
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    static int FindFirstRepeatValue(int[]arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

   /* static int LastRepeatedNumber(int[]arr){
        int valre = -1;
        for(int i=0;i<arr.length;i++)
            for ( int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j]) {

                }
            }
        return
    }

    */


    public static void main(String[] args) {
        System.out.print("Enter Array Size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+" Element");
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
        System.out.println(findMax(arr) + "  First max element");
        System.out.println(FindSecondMax(arr)+" Second Max Element: ");
        System.out.println(FindFirstRepeatValue(arr) + " is the repeated number");
       // System.out.println(LastRepeatedNumber(arr)+"LAST");
    }
}
