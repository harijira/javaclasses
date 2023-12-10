public class Min_and_Max_in_Array {
    public static void main(String[] args) {
        int[] arr={52,62,17,29,48,135,93};
        int temp;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Minimum: "+arr[0]);
        System.out.println("Maximum: "+arr[(arr.length-1)]);
    }
}
