import java.util.ArrayList;

public class sorting {
    static void main() {
        int[] arr={23,67,12,45,99,76};
        bubble(arr, arr.length);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void selection(int arr[], int n){
        for(int i=0; i<=n-2;i++){
                int mini=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
   static void bubble(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
   }

   static void selection_sort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
   }

   static void merge_sort(int[] arr,int low, int high){
        if(low>=high){
            return;
        }
        int mid=low+high/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
   }
   static void merge(int[] arr, int low, int mid, int high){
       ArrayList<Integer> temp=new ArrayList<>();
       int left=low;
       int right=mid+1;

//       while(left<=mid && right<=high){
//           temp.add
//       }
   }
}
