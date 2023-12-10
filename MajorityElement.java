public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={5,2,7,4,6,3,8};
        int majElement=0;
        int noOfTimes=1;
        for(int i=0; i<arr.length; i++){
            int currentElementTimes=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    currentElementTimes++;
                }
            }
            if(currentElementTimes>noOfTimes){
                majElement=arr[i];
                noOfTimes=currentElementTimes;
            }
        }
        if (majElement == 0 || noOfTimes<(arr.length/2)) {
            majElement = -1;
            noOfTimes = -1;
        }
        System.out.println("maj element: "+majElement);
        System.out.println("times: "+noOfTimes);
    }
}
