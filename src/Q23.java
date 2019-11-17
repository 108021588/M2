import java.util.Scanner;

public class Q23{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int a;
        while (n%10>0){
            a=n%10;
            System.out.print(a);
            n/=10;
        }
        System.out.println();
    }
}