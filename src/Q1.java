import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float min = scn.nextFloat();
        float  max=min;
        for (int i=1;i<=9;i++){
            float a =scn.nextFloat();
            if (a>max){
                max=a;
            }
            if (a<min){
                min=a;
            }
        }
        System.out.print("max=");
        System.out.printf("%.2f\n",max);
        System.out.print("min=");
        System.out.printf("%.2f\n",min);
    }
}