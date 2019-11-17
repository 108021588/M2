import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=0,m;
        for (int i=1;i<=n;i++){
          m=i+1;
          sum+=i*m;
        }
        System.out.println(sum);
    }
}