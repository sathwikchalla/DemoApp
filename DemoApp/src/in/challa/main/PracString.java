package in.challa.main;
import java.util.Scanner;
public class PracString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin"; //scp
		String s2=new String("Sachin"); //heap and scp , obj ref points to heap.
		System.out.println(s1==s2);
		StringBuilder s3=new StringBuilder("Sachin");
		StringBuilder s4=new StringBuilder("Sachin");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		char[] ch= {'J','A','V','A'};
		byte[] b= {65,66,67,68};
		String s5=new String(ch);

		String s6=new String(b);
		String s7=new String(s3);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		String k=new String("Sathwik");
		System.out.println("enter the char value to read:");
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		System.out.println(c);
		System.out.println(k.charAt(6));
		
		

	}

}
