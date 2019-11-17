import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=1,s=0;
        int nn=n;
        while (nn>10){
            sum+=1;
            nn=nn/10;
        }
        for (int i=1;i<=sum;i++){
            s+=n%10;
            n/=10;
        }
        System.out.println(sum);
        System.out.println(s);
    }
}