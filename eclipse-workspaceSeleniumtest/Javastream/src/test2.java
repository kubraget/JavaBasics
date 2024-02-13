import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.Test;

public class test2 {
	// print all the names of ArrayList with regural Java
	@Test
	public void actual() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Kubra");
		name.add("Fathima");
		name.add("Kaneez");
		name.add("Haj");
		name.add("Kulsum");
		for (int i = 0; i < name.size(); i++) {
			String actual = name.get(i);
			if (actual.length() > 4) {
				System.out.println(actual);
			}

		}
	}

	// print all the names of ArrayList with JavaStream
	//@Test
	public void streamFilter() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Kubra");
		name.add("Fathima");
		name.add("Kaneez");
		name.add("Haj");
		name.add("Kulsum");
		//name.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s -> s.length() > 4)
				.forEach(s -> System.out.println(s));
// print the first name with JavaStream
		//name.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
		Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s -> s.length() > 4).limit(1).forEach(s->System.out.println(s));

	}

}
