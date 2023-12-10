public class Array_ascending {
    public static void main(String[] args) {
        int[] arr={2,6,1,9,4,3};
        int temp;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){   // < for descending and > for ascending
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int values:arr) {
            System.out.println(values);
        }
        //System.out.println(arr[0]);
    }
}
