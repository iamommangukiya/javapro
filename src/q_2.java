import java.util.*;
public class q_2 {
    Scanner sc=new Scanner(System.in);
    void area()
    {
        System.out.println("enter the radius ");
        int red=sc.nextInt();
        System.out.println("area of circle is "+(3.147*red*red));

    }

    public static void main(String[] args) {
        q_2 obj =new q_2();
        obj.area();
    }
}
