package array_wap;

public class Sort {

	public static void main(String[] args) {
		
		int a[]= {53,12,48,65,25,7,68,32,92,54,76};
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					flag=1;
				}
				
			}
			
			if(flag==0) {
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
