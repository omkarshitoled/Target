package array_wap;

public class PrintArray {
	
	public void array1() {
		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void array1fe() {
		int a[]= {10,20,30};
		for(int i:a) {
			System.out.println(i+" ");
		}
	}
	
	public void array2() {
		int a[][]= {{10,20},{30,40,50}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}		
	
	public void array3() {
		int a[][][]= {{{10,20},{30,40,50}},{{60,70,80,},{90,100}}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}		
	
	public static void main(String[] args) {
		
		PrintArray pa= new PrintArray(); 
		System.out.println("1-D array is:");
		pa.array1();
		
		System.out.println("\n1-D array using foreach() is:");
		pa.array1fe();
		
		System.out.println("\n2-D array is:");
		pa.array2();
		System.out.println("\n3-D array is:");
		pa.array3();
	}

}
