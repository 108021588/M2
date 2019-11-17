import java.util.Scanner;

public class Q24{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int a=0;
        for (int i=1;i<n;i++){
            a+=i;
            if (a>n){
                a=i-1;
                break;
            }
        }
        System.out.println(a);
    }
}