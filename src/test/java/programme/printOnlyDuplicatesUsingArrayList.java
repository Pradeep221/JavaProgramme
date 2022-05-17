package programme;

import java.util.ArrayList;

public class printOnlyDuplicatesUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();

		a.add("Pradeep");
		a.add("Mukul");
		a.add("Pradeep");
		a.add("Pandey");
		a.add("Paliwal");
		a.add("Paliwal");
		int count=0;
		
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if(a.get(i).equals(a.get(j))) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(a.get(i)+"="+count+" ");
			}
			count=0;
		}

	}

}
