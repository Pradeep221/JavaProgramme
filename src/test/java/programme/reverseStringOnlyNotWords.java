package programme;

public class reverseStringOnlyNotWords {

	public static void main(String[] args) {
		String s="hello how are you";
		String[] sh=s.split(" ");
		for (int i = sh.length-1; i >=0; i--) {
			System.out.print(sh[i]+" ");
		}

	}

}
