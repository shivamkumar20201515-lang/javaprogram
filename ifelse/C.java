import java.util.*;
class C{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		if(num<0){
			num=-num;
		}
		System.out.println(num);
	}}