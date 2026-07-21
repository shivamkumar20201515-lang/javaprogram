import java.util.Scanner;
class N{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two number ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int big ;
		if(no1==no2){
			System.out.println("the no is same");
		}
 big=no1>no2? no1 : no2;
 System.out.println(big);
	}
}