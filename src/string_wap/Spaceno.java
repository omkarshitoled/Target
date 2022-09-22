package string_wap;

public class Spaceno {

	
	
	
	public static void main(String[] args) {
		String str="This is a nice day.";
		char ch[]=str.toCharArray();
		int space=0;
		for(int i=0; i<str.length();i++) {
			if(Character.isSpaceChar(ch[i])) {
				space++;
			}
		}
	
		System.out.println(space);
	}

}
