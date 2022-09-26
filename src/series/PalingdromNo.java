package series;

public class PalingdromNo {
	
	public static void main(String[] args) {

		int no=12321;
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		System.out.println("original no is : "+no);
		
		System.out.println("Reverse no is : "+rev);
		
		if(no==rev) {
			System.out.println("number is Palingdrom no");
		}
		else System.out.println("no is not pallingdrom no");
		
	
		
	}
	
}
