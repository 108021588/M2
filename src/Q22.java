import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        for (int i =1;i<=n/3;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if ((i*i)+(j*j)==(k*k) && i+j+k<=n){
                        System.out.println(i+"\t"+j+"\t"+k);
                    }
                }
            }
        }
    }
}