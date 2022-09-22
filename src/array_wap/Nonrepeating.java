package array_wap;

public class Nonrepeating {

	int a[]= {1,2,3,4,2,3,4,5,5};
	
	public void method1() {
		
		int res=a[0];
		
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
		}
		
		System.out.println(res);
	}
	
	public static void main(String[] args) {
	
		Nonrepeating nr = new Nonrepeating();
		
		System.out.println("Non repeating element is : ");
		nr.method1();
		
	
	}

}
