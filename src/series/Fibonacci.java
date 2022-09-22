package series;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println("Enter how many numers you want in series : ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(a+"\n"+b);
		int c;
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
