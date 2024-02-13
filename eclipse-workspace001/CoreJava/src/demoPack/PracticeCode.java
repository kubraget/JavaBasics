package demoPack;

import java.util.ArrayList;

public class PracticeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the unique number
		int a[] = { 1, 1, 2, 2, 2, 3, 4, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				// System.out.println(a[i]);
				// System.out.println(k);
				if (k == 1) {
					// System.out.println(a[i] + " " + "is unique number");
				}
			}
		}
		int k = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				// System.out.print(k);
				// System.out.print("\t");
				k++;
			}
			// System.out.println("");
		}

		int k1 = 1;
		for (int i1 = 0; i1 <= 4; i1++) {
			for (int j1 = 1; j1 <= i1; j1++) {
				// System.out.print(k1);
				// System.out.print("\t");
				k1++;
			}
			// System.out.println(" ");
		}
		// System.out.println(" ");

		int abc[][] = { { 9, 4, 5 }, { 3, 4, 7 }, { 1, 8, 9 } };
		int min = abc[0][0];// print the min value
		// int mincolumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					// mincolumn=j
				}
			}
		}
		System.out.println(min);// Op:1
		int xyz[][] = { { 9, 4, 5 }, { 3, 4, 7 }, { 1, 8, 9 } };
		int max = xyz[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (xyz[i][j] > max) {
					max = xyz[i][j];
				}
			}

		}
		System.out.println(max);// Op:9
		int pqr[][] = { { 9, 4, 5 }, { 3, 4, 7 }, { 1, 8, 9 } };
		int min1 = pqr[0][0];
		int mincolumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pqr[i][j] < min1) {
					min1 = pqr[i][j];
					mincolumn = j;
				}
			}
		}
		int max1 = pqr[0][mincolumn];
		int k3 = 0;
		while (k3 < 3) {
			if(pqr[k3][mincolumn]>max1)
			{
				max1 = pqr[k3][mincolumn];
			}
			k3++;
		}
		System.out.println(min1);//1
		System.out.println(max1);//9
	}
}