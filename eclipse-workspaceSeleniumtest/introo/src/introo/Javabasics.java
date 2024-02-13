package introo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String name = "kubra fathima";
		char letter = 'p';
		double dec = 0.123;
		boolean card = true;
		System.out.println(num);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(name);
		System.out.println(card);

		int[] no = new int[2];
		no[0] = 1;
		no[1] = 2;
		System.out.println(no[0]);
		System.out.println(no[1]);
		for (int i = 0; i < no.length; i++) {
			if (no[i] % 2 == 0) {
				System.out.println(no[i]);
				break;
			} else {
				System.out.println(no[i] + "yaaaaa");
			}
		}

		String[] names = { "kubra", "kaneez", "haj", "fathima" };
		for (String nam : names) {
			System.out.println(nam);
		}

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(4);
		a.add(5);
		a.add(6);
		a.remove(3);
		System.out.println(a);
		String s = "kubra fathima kaneez";
		List<String> d = Arrays.asList(s);
		for (String n : d) {
			System.out.println(n);
		}
		String[] s1 = s.split("fathima");
		System.out.println(s1[0]);
		System.out.println(s1[1].trim());
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		for (int i = s.length() - 1; i > 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
