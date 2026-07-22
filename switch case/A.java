import java.util.*;
class A{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		switch(no%2){
		case 0:System.out.println("no is even");
			break;
		default : System.out.println("no is odd");

		} 
	}
}