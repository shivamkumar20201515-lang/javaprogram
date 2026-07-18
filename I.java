import java.util.*;
class I{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the p");
		double p = sc.nextDouble();
		System.out.println("enter the intrest ");
		double r = sc.nextDouble();
		System.out.println("enter the time ");
		double t = sc.nextDouble();
		double si=p*r*t/100;
		System.out.println("SIMPLE INTREST ="+si);
		

	}
}