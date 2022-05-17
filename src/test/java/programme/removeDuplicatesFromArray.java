package programme;

import java.util.LinkedHashSet;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {5,3,7,3,9,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			set.add(x[i]);
		}
		for(Integer m:set) {
			System.out.print(m+" ");
		}

	}

}
