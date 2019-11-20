import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        boolean flag =true;
        for (int i=1;i<n;i++){
            int a=0;
            for (int j=i;j<=n;j++){
                a+=j;
                if (a==n){
                    flag=false;
                    for (int k=i;k<j;k++){
                        System.out.print(k+"+");
                    }
                    System.out.println(j);
                }
            }
        }
        if (flag){
            System.out.println("No");
        }
    }
}