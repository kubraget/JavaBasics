import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// can accecpt duplicate values		
//ArrayList,LinkedList,vector-Implementing List interface
//array have fixed size where as arraylist can grow dynamically you can access and insert any value in any index 
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kubra");
		a.add("java");
		a.add("java");// can accecpt duplicate values
		System.out.println(a);
		a.add(0, "Kaneez");
		System.out.println(a);
		/*a.remove(1);
		System.out.println(a);
		a.remove("java");
		System.out.println(a);*/
		System.out.println(a.contains("Testing"));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("Kubra"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
