package programme;
//WAP to print the number present in array using method design.
public class printANumFromArrayBydesiginingMethod {

	public static void main(String[] args) {
		int m=test(2);
		System.out.println(m);
	}
	
	public static int test(int index) {
		int[] a= {5,9,3,17,12,27};
		int x=a[index];
		return x;
		
	}

}
