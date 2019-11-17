import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int ans =0;
       for (int i =1;i<=n;i++){
           int ii=i;
           while (ii%5==0){
               ans+=1;
               ii/=5;
           }
       }
        System.out.println(ans);
    }
}