import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum=1;
        for (int i=1;i<=n+1;i++){
            sum*=2;
        }
        System.out.println(sum-2);
    }
}