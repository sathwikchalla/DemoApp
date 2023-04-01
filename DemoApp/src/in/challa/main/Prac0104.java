package in.challa.main;


class Demo0104
{
	static int a;
	static int b;
	
	static {
		System.out.println("static block");
		a=10;
		b=20;
	}
	
	int x;
	int y;
	{
		x=10;
		y=20;
		System.out.println("non static jav ablock");
	}
	Demo0104(){
		System.out.println("constructor");
	}
	void disp1()
	{
		System.out.println("non stataic method");
		System.out.println(x);
		System.out.println(y);
	}
	static void disp() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Prac0104 {
	int b=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo0104.disp();
		Demo0104 d=new Demo0104();
		d.disp1();
		int k=20;
		System.out.println(k);
		Prac0104 p=new Prac0104();
		p.b=300;
		p.display();
		
		boolean status =true;
		System.out.println( (status=false) || (status=true) | (status=false));
	}
	void display() {
		System.out.println(b);
		//System.out.println(k);
		
	}
	
	

}
