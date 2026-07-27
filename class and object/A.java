class Student{
	private String name;
	private int roll ;
	private double mark;
	void init()
	{
		name = "shivam";
		roll =20;
		mark =98.20;
	}
	void disp(){
		System.out.println("name ="+name);
		System.out.println("roll ="+roll);
		System.out.println("mark ="+mark);
	}
}
class A{
	public static void main(String arg[]){
		Student s=new Student();
		s.init();
		s.disp();
	}
}