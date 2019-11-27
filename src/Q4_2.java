import java.util.Scanner;

public class Q4_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        for (int i=1;i<a;i++){
            for (int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            if (i==1){
                System.out.print("*");
                System.out.println();
            }
            else {
                System.out.print("*");
                for (int k = 1; k <= 2 * (i-1) - 1; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        for (int i=1;i<=2*a-1;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}