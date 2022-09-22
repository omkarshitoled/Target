package series;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		int no=1634;
		int temp=no;
		int count=0;
		
		while(temp!=0) {
			
			temp=temp/10;
			count=count+1;
		}
		int t2=no;
		int rem;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			rem=t2%10; 
			for(int i=0;i<count;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		
		System.out.println(arm);
		
		if(arm==no) {
			System.out.println(no+" is armstrong no");
		}
		else System.out.println(no+" is not armstrong no");

	}

}
