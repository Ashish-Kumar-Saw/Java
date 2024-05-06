package collegeWallah.Array;

public class reverse {

     static void PrintArray(int[]arr){
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
    static int[] Reverse(int[]arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1;i>=0;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int[]ans = Reverse(arr);
        PrintArray(ans);
    }
}
