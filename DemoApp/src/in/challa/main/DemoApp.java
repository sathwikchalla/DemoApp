package in.challa.main;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30};
		for(int ele : a) {
			System.out.println(ele);
		}
		String name="sachin";
		int count=name.toUpperCase().length();
		System.out.println("the length of the string is:" +count);
		
		StringBuffer sb=new StringBuffer("virat");
		int length=sb.append("India").reverse().length();
		System.out.println(length);

	}

}
