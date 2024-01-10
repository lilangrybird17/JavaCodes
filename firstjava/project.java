package firstjava;

public class project {
	
	
	void add (int a, int b) {
	
	int c=a+b;
	System.out.println("addition =" +c);
	
	}


	void sub (int a, int b) {
	
	int c=a-b;
	System.out.println("substract =" +c);
	}
	
	void mult (int a, int b) {
		
		int c=a*b;
		System.out.println("multiplication =" +c);
	
}
	
	
	public static void main(String[]args) {
	
	System.out.println("hello world");
	project p=new project() ;
		p.add(50,40);
		p.sub(60,10);
		p.mult(60,40);


}
}
	
	


