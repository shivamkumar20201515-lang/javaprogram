import java.util.*;
class I{
    public static void main (String arg[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the salary");
        double sal= sc.nextDouble();
        double da , hra ,total;
        if(sal>=5000){
            da = sal*3;
            hra = sal*2;

        }
        else{
            da = sal*0.4;
            hra = sal*1;

        }
        total = sal+da+hra;
        System.out.println("salary =" +sal);
        System.out.println("da =" +da);
        System.out.println("hra =" +hra);
        System.out.println("  Tsalary=" +total);

    }
}