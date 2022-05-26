package programme;

public class printDuplicatesWithoutUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pradeep";
		char[] ch=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>1) {
			System.out.print(ch[i]+"="+count+" ");
			}
			count=0;
		}

	}

}
