package collegeWallah.Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class xyz {
    static void Swap(int[]a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {


       /* String [] name = {"Ashish","Ravi","Sandip"};
        int [] number = {1,2,3,4,5,6,7,8,9,0};
        float [] weight = {12.3f,34.5f,4.5f};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[4]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);
        System.out.println(number[7]);
        System.out.println(number[8]);

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
*/

    /*    int [][]TwoD = {
                {1,2,3,4},
                {4,5,6,4},
                {7,8,9,4},
                {10,2,5,4}



        };
        System.out.println(TwoD.length);
        for(int i=0;i<TwoD.length;i++)
        {
            for(int j = 1;j<TwoD.length;j++){
                System.out.println(TwoD[i][j]);
            }
        }
       // TwoD[0][1] = 4; for change the value
      //  System.out.println(TwoD[0][0]);
      //  System.out.println(TwoD[0][1]);
      //  System.out.println(TwoD[0][2]);
       // System.out.println(TwoD[1][0]);
       // System.out.println(TwoD[1][1]);
      //  System.out.println(TwoD[1][2]);gggm
     //   System.out.println(TwoD[2][1]);

     //   System.out.println("length");
     //   System.out.println(TwoD.length);
*/
      int []a={100,21,23,24,25};
       /* for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
*/
        int i=0;
        int j =a.length-1;

        for(i=0;i<j;i++){
            while (i<j){
            Swap(a,i,j);
            i++;
            j--;
        }

            System.out.print(a[i]+" ");
        }

    }
}
