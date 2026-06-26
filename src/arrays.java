public class arrays {
    static void main() {
//        int[] arr={3,6,2,9,9,8,14,14};
//        largest_no(arr);
//        sLargest_no(arr);

//        boolean x=IfSorted(arr);
//        System.out.println(x);

//        int x= remove_duplicates(arr);
//        for(int i = 0; i < x; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr = {3,6,2,9,9,8,14,14};
//        leftRotateByD(arr, 2);
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int[] arr = {1,0,2,3,0,4,0,1};
        move_zeros(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

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
    static boolean IfSorted( int[] arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            {return false;}
        }
        return true;
    }
    static int remove_duplicates(int[] arr){
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    static void reverse(int[] arr,int a, int b){

        while(a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    static void leftRotateByD(int[] arr,int d){
        int n= arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void move_zeros(int[] arr){
        int j=-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
    }

}
