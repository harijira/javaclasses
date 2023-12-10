import java.util.Arrays;

public class Array_comparison {
    public static void array_rearrange(int[] a){
        int temp;
        for (int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void print_array(int[] a){
        int[] pnt={};
        for (int i: a) {
            pnt=a;
        }
        System.out.println(Arrays.toString(pnt));
        //System.out.println("{"+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+"}");
    }

    public static void array_comparision(int[] a, int[] b){
        int res=0;
        if (a.length==b.length){
            for (int i=0; i<a.length; i++){
                if (a[i]==b[i]){
                    res++;
                }
            }
            if (res==a.length){
                System.out.println("Same Arrays");
            }
            else {
                System.out.println("Different Arrays");
            }
        }
        else {
            System.out.println("Different Arrays");
        }
        //System.out.println(res);
    }

    public static void main(String[] args) {
        int[] a1={725,386,48,510,79,2};
        int[] a2={79,510,386,2,725,48};
        array_rearrange(a1);
        array_rearrange(a2);
        System.out.println("Rearranged two arrays are:");
        print_array(a1);
        print_array(a2);
        array_comparision(a1, a2);
    }
}
