class O{
	public static void main(String arg[]){
		int i;
		for(i=1;i<=7;i++){
			System.out.println("A");
			if(i>=4){
				continue;
			}
			System.out.println("B");

		}
		System.out.println(i);
	}
}