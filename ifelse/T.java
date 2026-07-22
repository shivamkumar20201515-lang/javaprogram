import java .util.*;
class T{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the CHAR");
		char sc = sc.next() charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
            System.out.println("'" + ch + "' is an Uppercase Letter.");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' is a Lowercase Letter.");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("'" + ch + "' is a Digit.");
        } 
        else {
            System.out.println("'" + ch + "' is a Special Symbol/Character.");
        }
    }}
    