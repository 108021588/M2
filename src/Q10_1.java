import java.util.Scanner;

public class Q10_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int m=scn.nextInt();
        for (int i=1;i<m;i++){
            for (int j=1;j<m;j++){
                System.out.print(i*j+"\t");
            }
            for (int j=m+1;j<=n;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
        for (int i=m+1;i<=n;i++){
            for (int j=1;j<m;j++){
                System.out.print(i*j+"\t");
            }
            for (int j=m+1;j<=n;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}