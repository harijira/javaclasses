public class Missing_element_in_array {
    public static void array_comparision(int[] a1, int[] a2){
        int tot1=0;
        int tot2=0;
        for (int i : a1) {
            tot1 = tot1 + i;
        }
        for (int i : a2) {
            tot2 = tot2 + i;
        }
        int mis=tot1-tot2;
        System.out.println("Missing Number is: "+mis);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] b={7,5,10,1,8,2,12,3,11,4,6};
        array_comparision(a,b);
    }
}
