package programme;

public class printSmallAndCapitalCasesAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pradeep"; // output pRaDeEp
		char[] ch=s.toCharArray();
		
		String x = s.toUpperCase();
		char[] m=x.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0) {
				System.out.print(ch[i]);
			}
			else {
				System.out.print(m[i]);
			}
		}

	}

}
