public class arrays {
    static void main() {
        int[] arr={3,6,2,14,9,9,8,14};
//        largest_no(arr);
        sLargest_no(arr);
    }

    static void largest_no( int[] arr){
        int largest = arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    static void sLargest_no( int[] arr){
        int largest= arr[0];
        int sLargest=-1;

        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        System.out.println(sLargest);
    }

}
