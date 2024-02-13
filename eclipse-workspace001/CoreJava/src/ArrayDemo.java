
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays
		int a;
		a = 1;
		//System.out.println(a);// declaring single variable

		int b[] = new int[4];// Declaring arrays and allocating memory for the valves
		b[0] = 2;
		b[1] = 4;
		b[2] = 6;
		b[3] = 8;
		for (int i = 0; i < b.length; i++) {
			//System.out.println(b[i]);

		}
		int c[] = {3,6,9,12,15};//directly passing the value
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}

	}
}
