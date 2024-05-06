package collegeWallah.Array;
class Solution {
    static void SumOfTwoArray() {
        int[] num = {2, 7, 11, 15};
        int n = num.length;
        int target = 18;
        int sum = 0;
        int i = 0;
        for ( i = 0; i < n; i++) {
            sum = sum + num[i];

            if (sum == target)
                break;
            System.out.println(num[i]);
        }

    }

}
public class XYZ2 {
    public static void main(String[] args) {
     Solution obj = new Solution();
     obj.SumOfTwoArray();
    }
}
