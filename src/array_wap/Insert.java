package array_wap;

public class Insert {

	public static void main(String[] args) {
		int a[]= {53,12,48,65,25,7,68,32,92,54,76};
		
		int pos=3;
		int element=100;
		for(int i=a.length-1;i>pos-1;i--) {
			a[i]=a[i-1];
			
		}
		a[pos-1]=element;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
