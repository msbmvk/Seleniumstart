package seleniumstart.seleniumstart;

public class Child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cb= new Child();
		cb.sum(12, 345);
		cb.sum(1, 10);
		cb.sum(1, 40, 60);
		cb.display();
		cb.show();
		parent pb= new parent();
		pb.display();
		pb.show();
		
		parent pc = new Child();
		pc.display();
		pc.show();
		
		//Child cp= new parent();
		

	}
	
	public void display()
	{
		System.out.println("Child M1");
	}
	
	public void show()
	{
		System.out.println("Child M2");
	}
	
	public void sum(int a, int b) {
		int c= a+b;
		System.out.println("sum of two Int val..."+c);
	}
	public void sum(int a, int b, int c) {
		int d= a+b+c;
		System.out.println("sum of three Int val..."+d);
	}
	public void sum(int a, double b) {
		double c= a+b;
		System.out.println("sum of two Int val..."+c);
	}

}
