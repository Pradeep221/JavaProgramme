package programme;

public class reverseTheNumber {

	public static void main(String[] args) {
	int num=12345;
	int x=num;
	int sum=0;
	while(x>0) {
		int ld=x%10;
		sum=sum*10+ld;
		x=x/10;
	}
	System.out.print(sum);

	}

}
