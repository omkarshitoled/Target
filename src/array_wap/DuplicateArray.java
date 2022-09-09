package array_wap;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	
	int a[]= {15,35,48,32,98,12,47,71,12,47,35,32,};
	
	public void method1() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && (i!=j)) {
					System.out.println(a[j] );
				}
			}
		}
	}
	
	public void method2() {
		Set<Integer> s = new HashSet<>();
		for (int i:a) {
			if(s.add(i)==false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		DuplicateArray da=new DuplicateArray();
		
		System.out.println("Duplicate nos by method 1: ");
		da.method1();
		
		System.out.println("\nDuplicate nos by method 2: ");
		da.method2();

	}

}
