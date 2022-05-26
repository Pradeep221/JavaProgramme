package programme;
//WAP to print all numbers bw 1 to 100 ending with 4.
public class numEndingWith4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		for (int i = 0; i < num; i++) {
			int ld=i%10;
			if(ld==4) {
				System.out.print(i+" ");
			}
		}

	}

}
