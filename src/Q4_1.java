import java.util.Scanner;

public class Q4_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=a-1;i>=1;i--){
            for (int j=a-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=2*i-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}