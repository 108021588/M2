import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.printf("%08d\n",Integer.parseInt(str));

    }
}