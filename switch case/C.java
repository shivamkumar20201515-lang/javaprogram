import java.util.*;
class C{
	public static void main (String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("take a choice 1. square // 2. rectangle // 3. circle");
		int ch = sc.nextInt();
		switch(ch){
		case 1:System.out.println("enter the side of square");
			int s= sc.nextInt();
			System.out.println("square "+s*s);
			break;
		case 2:System.out.println("enter the length and breath ");
			int l=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("area of rectangle ="+l*b);
			break;
		case 3: System.out.println("enter the radius oof circle");
			int r=sc.nextInt();
			System.out.println("are of cicle"+3.14*r*r);
			break;
		default:System.out.println("invaild choice");
			break;

		}
	}
}