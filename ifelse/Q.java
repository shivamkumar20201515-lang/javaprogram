import java.util.Scanner;
class Q{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the salary");
			double sal =sc.nextDouble();
			double da , hra ,total ;
			if(sal>=8000){
				da=0.8*sal;
				hra =0.7*sal;
			}
			else if(sal>=5000){
				da=0.5*sal;
				hra=0.6*sal;
			}
				else if(sal>=3000){
				da=0.2*sal;
				hra=0.5*sal;
			}
			else {
				da=0.1*sal;
				hra=0.9*sal;
			}
			total=da+hra+sal;
			System.out.println("salary"+sal);
			System.out.println("da"+da);
			System.out.println("hra"+hra);
			System.out.println("total salary"+total);
		}
	}