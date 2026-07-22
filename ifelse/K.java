import java.util.*;
class K{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
 System.out.println("enter a number");
 int no=sc.nextInt();
 if(no<0){
 	no=-no;
 }
 if(no<10)
 		System.out.println("sd");
 else if(no<100)
 	System.out.println("d d");
 else if(no<1000)
 	System.out.println("t d");
 else 
 	System.out.println("od");
}}