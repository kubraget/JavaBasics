import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "gudbye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		hm.put(42, "hey");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// HashTable - pass table set collections
		while (it.hasNext()) {
			System.out.println(it.next());
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
