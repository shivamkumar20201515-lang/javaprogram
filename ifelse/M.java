import java.util.Scanner;
class M{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the salary");
			double sal =sc.nextDouble();
			double da , hrc ,total ;
			da=sal>=5000?sal*0.4 : sal*0.2;
			hrc=sal>=5000?sal*0.5 : sal*0.3;
			total=sal+da+hrc;
			System.out.println("salary ="+sal);
			System.out.println(" da ="+da);
			System.out.println("HRC ="+hrc);
			System.out.println("total salary"+total);
		
	}
}