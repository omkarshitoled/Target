package pattern_wap;

public class Triangle {
	
	public void simpletriangle(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void inverttriangle(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void simplrinverttriangle(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=0;k<=n;k++) {
			for(int j=n;j>k;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	
	public void pyramidtriangle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void invertpyramidtriangle(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
	


	public static void main(String[] args) {
		Triangle tr=new Triangle();
		
		System.out.println("\n Simple Triangle : ");
		tr.simpletriangle(6);
		
		System.out.println("\n Invert Triangle : ");
		tr.inverttriangle(6);
		
		System.out.println("\n Simple+Invert Triangle : ");
		tr.simplrinverttriangle(6);
		
		System.out.println("\n Pyramid Triangle : ");
		tr.pyramidtriangle(6);
		
		System.out.println("\n Invert Pyramid Triangle : ");
		tr.invertpyramidtriangle(6);
		
		
	}

}
