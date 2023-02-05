import java.util.*;
public class Q_1 {
    Scanner sc = new Scanner(System.in);
    void cha(){
        System.out.println("enter the number");
        int a=sc.nextInt();
        if(a>0) {
            System.out.println("positive number");
        }else {
            System.out.println("negative number");
        }
    }
    public static void main(String[] args){
        Q_1 obj =new Q_1();
        obj.cha();
    }

}
