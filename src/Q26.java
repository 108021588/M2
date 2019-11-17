import java.util.Scanner;

public class Q26{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int a=n;
        while (n>=3){
            a+=n/3;
            n=n/3+n%3;
        }
        System.out.println(a);
    }
}