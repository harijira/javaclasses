public class Contiguous_sub_array {
    public static void main(String[] args) {
        int[] a={3,1,-6,8,-2}; //
        int sum=0;
        int max_sum=0;
        for (int i : a) {
            sum = sum + i;
            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        System.out.println(max_sum);
//        String str=new String("hari");
//        System.out.println(str.charAt(2));
//        System.out.println(str.substring(1));
    }
}
