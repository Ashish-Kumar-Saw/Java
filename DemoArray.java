package collegeWallah.Array;
class Array {
    void demoArray() {
        int ages[] = new int[3];
        ages[0] = 12;
        ages[1] = 55;
        ages[2] = 45;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        float[] weight = new float[2];
        weight[1] = 12.6f;
        weight[0] = 234.2f;
        System.out.println(weight[1]);
        System.out.println(weight[0]);

        String []names = new String[2];
        names[0] = "Ashish";
        names[1] = "Sriyanshu";
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}

public class DemoArray {

    public static void main(String[] args) {
        Array obj = new Array();
        obj.demoArray();
    }
}
