package collegeWallah.Array;
class Search {


    void SearchArray() {
        int []arr = {1,3,2,42,4};
        int x = 0;
        int ans = -1;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]==x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("not found");
        }else {


            System.out.println( x + " at index " + ans);
        }

    }
}


        public class FindMaxValueArray {
            public static void main(String[] args) {
                Search obj = new Search();
                obj.SearchArray();
                int[] Array = {23, 1, 3, 23, 2, 4, 4, 2, 5, 3, 5, 42, 67};
                int ans = 0;
                for (int i = 0; i < Array.length; i++) {
                    if (Array[i] > ans) {
                        ans = Array[i];
                    }
                }
                System.out.println("max:-" + ans);
            }
        }


