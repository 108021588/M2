import java.util.Scanner;

public class Q25{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=0;
        for (int i=2;i<=n;i++){
            int ii=i;
            while (ii%2==0){
                ii/=2;
            }
            while (ii%3==0){
                ii/=3;
            }
            while (ii%5==0){
                ii/=5;
            }
            if (ii==1){
             sum+=i;
            }
        }
        System.out.println(sum);
    }
}