import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int a =Math.min(n,m);
        int s=0,b=0;

        for (int i=1;i<=n;i++){
            if (n%i==0 && m%i==0){
                s =i;
            }
        }
        for (int j=n*m;j>a;j--){
            if (j%n==0 && j%m==0){
                b =j;
            }
        }
        System.out.println(s);
        System.out.println(b);
    }
}