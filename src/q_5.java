import java.util.Scanner;

public class q_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the line  ");

        int n= sc.nextInt();
        for (int i=0;i<=n;i++){
            System.out.print(" ");
            for (int j=n;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
