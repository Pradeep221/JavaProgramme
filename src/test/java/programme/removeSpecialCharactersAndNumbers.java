package programme;

public class removeSpecialCharactersAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bdf13%*9amgj?/";
		String m="";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				m=m+ch[i];
			}
		}
		System.out.print(m);
	}

}
