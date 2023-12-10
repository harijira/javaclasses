public class JumpsInArrays {
    public static void main(String[] args) {
        int[] arr={2,1,4,6,9,5,3,8,7,5};
        int jumps=0;
        int i=0;
        int conditionalValue=arr.length-(i+1);
        while (i<=conditionalValue){
            i=i+arr[i];
            jumps++;
//            System.out.println("con: "+conditionalValue);
            if(i==conditionalValue){
                break;
            }
        }
        System.out.println("Jumps: "+jumps);
    }
}
