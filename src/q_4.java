import java.util.*;
public class q_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the line  ");

        int n= sc.nextInt();
        for (int i=0;i<=n;i++){

            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
