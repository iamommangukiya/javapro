import java.util.*;
public class q_3 {
    Scanner sc=new Scanner(System.in);
    void maxmin()

    {
        System.out.println("enter the length of list");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("enter the "+i+" enlement");
            a[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        for (int z:a
             ) {
            if(max<z){
                max=z;
            }
            if(min>z){
                min=z;
            }



        }
        System.out.println("large number is "+max);
        System.out.println("small number is "+min);

    }

    public static void main(String[] args) {
        q_3 obj=new q_3();
        obj.maxmin();
    }
}
