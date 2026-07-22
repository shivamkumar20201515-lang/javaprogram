import java.util.*;
class R{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter two number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("enter the choice 1. add // 2. sub // 3. mult //");
		int ch= sc.nextInt();
		if(ch==1){
			System.out.println("add the number ="+(no1+no2));

		}
		else if(ch==2){
			System.out.println("sub the number ="+(no1-no2));

		}
		else if(ch==3){
			System.out.println("mult the number ="+no1*no2);

		}
		else{
			System.out.println("invalid choice");
		}
	}
}