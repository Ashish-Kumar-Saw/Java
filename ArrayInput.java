package collegeWallah.Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = in.nextInt();
        int []arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0;i<arr.length;i++){
           arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
