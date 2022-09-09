 
package array_wap;

import java.util.HashSet;

public class FirstDuplicate {
	int a[]= {2,6,4,3,1,8,9,6,3,5};
	
	
	public void collectionmethod() {

		int temp=-1;
		HashSet<Integer> hs= new HashSet<>();
		for(int i=a.length-1; i>=0;i--) {
			if(hs.contains(a[i])) {
				temp=i;
			}
			else hs.add(a[i]);
		}
		
		if(temp>=0) {
			System.out.println("First Duplicate Element is : "+a[temp]);
		}
		else System.out.println("First Duplicate Element not Found.");
	}
	
	
	public void arraymethod() {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println("First Duplicate Element is : "+ a[i]);
					temp=+1;
					break;
				} 
			}
			
			if(temp>0) {
				break;
				
				
			} 
		}
	}

	public static void main(String[] args) {
		
		FirstDuplicate fd=new FirstDuplicate();
		
		fd.collectionmethod();
		
		fd.arraymethod();
		
	
	}

}
