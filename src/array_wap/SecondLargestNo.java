package array_wap;

public class SecondLargestNo {

	public static void main(String[] args) {
		
		int a[]= {24,23,56,8,49,79,12,56};
		int temp;
		int n=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array is :");
		for(int i=0;i<a.length;i++) {
			System.out.print(+a[i]+" ");
		}
		System.out.println("\n2nd largest no is : "+a[n]);
	}

}
