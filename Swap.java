package collegeWallah.Array;

public class Swap {

    static void Swap(int a,int b){
         a = 5;
        b = 4;
        System.out.println("Before swap:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    static void swapWithoutTemp(int a,int b){
        a = 5;
        b = 4;
        System.out.println("Before swap:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println("After swap: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        Swap( a, b);
        swapWithoutTemp(a,b);

    }
}
