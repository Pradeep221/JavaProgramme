package programme;
//WAP to add and print keys and values of map by adding to arraylist.
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class mapDataToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put("Pradeep", 29);
		map.put("Mukul", 28);
		map.put("King", 21);
		map.put("Queen", 18);
		
		Set keys = map.keySet();
		Collection values = map.values();
		
		System.out.print(keys);
		System.out.print(values+" ");

	}

}
