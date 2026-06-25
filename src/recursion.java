import java.util.Collection;

import static java.util.Collections.swap;

public class recursion {
    static void main() {
//        N_times(1,5);
//        OneToN(5,15);
//        NtoOne(5,5);
//        sumtoN_p(5,0);
//        System.out.println(sumtoN_f(3,0));
        //char[] arr={'m','a','d','s','m'};
       // reverse2p(0, arr.length-1, arr);
//        reverse1p(0,arr);
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
        //boolean b =palindromeCHAR(0,arr);
        //System.out.println(b);
        //System.out.println(fibonacci(5));
        
    }
    static void N_times(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("noor");
        N_times(i+1,n);
    }
    static void OneToN(int i,int n){
        if(i>n){ return;}
        System.out.println(i);
        OneToN(i+1,n);
    }
    static void NtoOne(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        NtoOne(i-1,n);
    }
    static void sumtoN_p(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumtoN_p(i-1,sum+i);
    }
    static int sumtoN_f(int i,int sum){
        if(i==0){
            return 0;
        }else {
            return i +sumtoN_f(i-1,sum*i);
        }
    }
    static void fact_p(int i,int mul){
        if(i<1){
            System.out.println(mul);
            return;
        }
        fact_p(i-1,mul*i);
    }
    static int fact_f(int i){
        if(i==0){
            return 0;
        }else{
            return i * fact_f(i-1);
        }
    }

    static void reverse2p(int l, int r, int[] arr){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse2p(l+1,r-1,arr);

    }
    static void reverse1p(int i, int[] arr){
        if(i>= arr.length/2){
            return;
        }
        int x= arr.length-i-1;
        int temp=arr[i];
        arr[i]=arr[x];
        arr[x]=temp;

        reverse1p(i+1,arr);
    }
    static boolean palindromeINT(int i,int[]arr){
        if(i>= arr.length/2){
            return true;
        }
        int x= arr.length-i-1;
        if(arr[i]!=arr[x]){
            return false;
        }
        return palindromeINT(i+1,arr);
    }
    static boolean palindromeCHAR(int i,char[] arr){
        if(i>= arr.length/2){
            return true;
        }
        int x= arr.length-i-1;
        if(arr[i]!=arr[x]){
            return false;
        }
        return palindromeCHAR(i+1,arr);
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last =fibonacci(n-1);
        int Slast=fibonacci(n-2);
        return last+Slast;
    }



}
