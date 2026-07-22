import java.util.*;
class B{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println("choice the number 1. add // 2. sub // 3.mult ");
		int ch = sc.nextInt();
		switch(ch){
		case 1:System.out.println(" add ="+(no1+no2));
			break;
		case 2: System.out.println("sub ="+(no1-no2));
			break;
		case 3:System.out.println("mult ="+no1*no2);
			break;
		default:System.out.println("invalid number");

		}
	}}
	