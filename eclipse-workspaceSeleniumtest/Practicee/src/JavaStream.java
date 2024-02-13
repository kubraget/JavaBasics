import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.testng.Assert;

public class JavaStream {
	@Test
	public void filterStream()
	{
		long c =Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s->s.startsWith("K")).count();
		System.out.println(c);
		List<String> ls = Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").collect(Collectors.toList());
		ls.stream().filter(s->s.startsWith("K")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		ls.stream().filter(s->s.startsWith("K")).sorted().limit(2).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> n1 = Arrays.asList("Kubra","Fathima", "Kaneez", "Haj", "Kulsum");
		List<String> n2 = Arrays.asList("Ayesha","suchitra","kaunian");
		Stream<String> newstream = Stream.concat(n1.stream(),n2.stream());
		boolean flag = newstream.anyMatch(s->s.equals("Kubra"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		List<Integer> num = Arrays.asList(3,2,2,5,1,9,7);
		List<Integer> numb = num.stream().distinct().sorted().collect(Collectors.toList());
		numb.forEach(s->System.out.println(s));
		System.out.println((numb.get(3)));
	}

}
