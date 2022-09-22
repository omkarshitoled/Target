package string_wap;

public class Sort {

	public static void main(String[] args) {
		String s[]= {"Pranali","Mansi","Rajendra","Amit","Yash","Nisha","Tukaram","Tanishka"};
		
		for(int i=0;i<s.length;i++) {
			int flag=0;
			for(int j=i+1;j<s.length;j++) {
				
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					flag=1;
				}
			}
			
			if(flag==0) {
				break;
			}
		}
		
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
	}

}
