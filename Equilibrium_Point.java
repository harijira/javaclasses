public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] a={2,4,1,5,4,3};
        int l_sum=0;
        int r_sum=0;
        for(int i=0; i<a.length; i++){
            if(i>0){
                l_sum=l_sum+a[i-1];
            }
            for(int j=i+1; j<a.length; j++){
                r_sum=r_sum+a[j];
            }
            if(l_sum==r_sum){
                System.out.println("Equilibrium Position: "+ (i+1));
                break;
            }
            else if (i==(a.length-1)) {
                System.out.println("Equilibrium Position: -1");
            }
            else {
                r_sum=0;
            }
        }
    }
}
