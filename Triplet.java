class Check{
    void tri_ops(int[] a1){
        int tot=0;
        for(int i=0; i<a1.length; i++){
            for (int j=i+1; j<a1.length; j++){
                for (int k=j+1; k<a1.length; k++){
                    tot=a1[i]+a1[j]+a1[k];
                    if (tot==0){
                        //System.out.println(i+","+j+","+k);
                        System.out.println("1");
                        break;
                    }
                }
                if(tot==0){
                    break;
                }
            }
            if(tot==0){
                break;
            }
        }
        if(tot!=0){
            System.out.println("0");
        }
    }
}
public class Triplet {
    public static void main(String[] args) {
        int[] a={5,2,-4,-1,3};
        Check c=new Check();
        c.tri_ops(a);
    }
}
