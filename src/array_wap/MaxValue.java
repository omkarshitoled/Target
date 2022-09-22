package array_wap;

public class MaxValue {
	public static void main(String[] args) {
	
		int arr[]= {24,23,56,8,49,79,12,56};
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		
		}
		
		System.out.println("Max no is : "+temp);
	}

}
