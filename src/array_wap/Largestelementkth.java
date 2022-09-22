package array_wap;

import java.util.Scanner;

public class Largestelementkth {

	int a[]= {6,2,4,8,1,9,3,7,5};
	int k;
	public void method1() {
		System.out.println("Enter kth value to print Kth largest element : ");
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println(k+"th largest element is : ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
			
			if(i==k-1) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println("-------------------");
		for(int i:a) {
			
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Largestelementkth le = new Largestelementkth();
		
		System.out.println("Kth largest element by Method 1 : ");
		
		
		le.method1();
	}

}
