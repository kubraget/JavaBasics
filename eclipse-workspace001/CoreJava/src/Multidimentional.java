
public class Multidimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multidimensional arrays
		// a[row][column]
		int a[][] = new int[2][3]; // Declaring arrays and allocating memory for the valves
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		// System.out.println(a[1][0]);
		for (int i = 0; i < 2; i++) // for loop for row [2 rows]
		{
			for (int j = 0; j < 3; j++)// //for loop for column [3 column]
			{
				System.out.println(a[i][j]);
			}
		}
		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 5, 8, 1 } };// directly passing the value
		// System.out.println(b[2][1]);
	}

}
