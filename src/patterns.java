import java.util.Scanner;

public class patterns {

    void pattern2(int n){
        for (int i=0;i<n;i++){
            int start=1;
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    void pattern3(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<(2*n-(2*i)-1);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern4(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<='A'+n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern6(int n){
        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            if(i%2!=0) {c='A';}
            for(int j=0;j<((2*i)-1);j++){
                System.out.print(c);

            }
            System.out.println();
        }
    }

    void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            for(int k=0;k<((2*i)-1);k++){
                System.out.print(" ");
            }
            for(int j=(n-i);j<1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<(2*n-((2*i)+1));k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        patterns p = new patterns();

        int n = sc.nextInt();

        p.pattern7(n);
        sc.close();
    }
}
