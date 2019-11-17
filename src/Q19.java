import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=1,m=1;
        while (sum<=n){
            System.out.print(sum+"\t");
            sum+=m;
            m++;
        }
        System.out.println(sum);
        for (int i=1;i<=n+1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}