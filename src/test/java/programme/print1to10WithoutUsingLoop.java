package programme;

public class print1to10WithoutUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1);
	}
	public static void test(int n) {
		if(n<11) {
		System.out.print(n+" ");
		test(n+1);
		}
	}

}
