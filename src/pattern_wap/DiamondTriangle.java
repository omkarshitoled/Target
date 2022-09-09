package pattern_wap;

public class DiamondTriangle {

public void diamondtriangle1(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
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


public void diamondtriangle2(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				if(j>1) {
					System.out.print(" ");
				}
				else System.out.print("* ");
			System.out.println();
			}
	}
		for(int i=0;i<n;i++) {
			for(int j=0; j<i; j++) {
				if(j<1) {
					System.out.print("* ");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		
		DiamondTriangle dt=new DiamondTriangle();
		System.out.println("\n Diamond Triangle : ");
		dt.diamondtriangle1(6);
		
		dt.diamondtriangle2(6);

	}

}
