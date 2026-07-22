import java .util.*;
class S{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		if(no%35==0){
			System.out.println("number is divisible by 5 and 7");

		}
		else if (no%5==0){
			System.out.println("number is divisible by 5");
		}
		else if (no%7==0){
			System.out.println("number is divisible by 7");

		}
		else{
			System.out.println("invaild number");
		}

	}
}