import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashSet TreeSet,LinkedHashSet,implements Set interface
		// does not accept duplicate values
		// there is no gurantee elements stored in Sequential order but is stored in
		// Random order

		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("KOREA");
		hs.add("JAPAN");
		hs.add("INDIA");
		hs.add("UK");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			System.out.println(it.next());
		}

	}

}
