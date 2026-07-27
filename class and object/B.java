class Student{
	private String name;
	private int roll;
	private double mark;
	void init(){
		name ="shivam";
		roll = 20;
		mark =90.98;

	}
	void disp(){
		System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	}
}
class B{
	public static void main(String arg[]){
		Student s=new Student();
		s.init();
		s.disp();
		Student s1=new Student();
		s1.init();
		s1.disp();
	}
}