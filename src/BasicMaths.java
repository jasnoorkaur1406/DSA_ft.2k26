public class BasicMaths {
    static void main() {
        extraction(23776554);
        reverse(123456789);
        palindrome(1221);
        palindrome(5566);
        armstrong(371);
        armstrong(16);
    }

    static void extraction(int n){
        int count=0;
        while(n>0){
            int ld= n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }

    static void reverse(int n){
        int revN=0;
        while(n>0){
            int ld= n%10;
            n=n/10;
            revN=(revN*10)+ld;
        }
        System.out.println(revN);

    }

    static void palindrome(int n){
        int dup =n;
        int revN=0;
        while(n>0){
            int ld= n%10;
            n=n/10;
            revN=(revN*10)+ld;
        }
        if(revN==dup) {
            System.out.println("yes its a pallindrome");
        }else
        {
            System.out.println("yes its not a pallindrome");
        }
    }

    static void armstrong(int n){
        int dup=n;
        int sum=0;
        while(n>0){
            int ld= n%10;
            n=n/10;
            sum=sum+(ld*ld*ld);
        }
       if(dup==sum){
           System.out.println("its an armstrong number");
       }else{
           System.out.println("its not an armstrong number");
       }
    }

}
