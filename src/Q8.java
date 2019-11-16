import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sum =0;
        for (int i=1;i<=n;i++){
            if (i%3==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}