import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.testng.Assert;

public class test1 {
	// count the number of name starting with alphabet "K" in list with regural Java
	//@Test
	public void reguralJava() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Kubra");
		name.add("Fathima");
		name.add("Kaneez");
		name.add("Haj");
		name.add("Kulsum");
		int count = 0;
		for (int i = 0; i < name.size(); i++) {
			String actual = name.get(i);
			if (actual.startsWith("K")) {
				count++;
			}
		}

		System.out.println(count);
	}

	// count the number of name starting with alphabet "K" in list with JavaStream
	//@Test
	public void streamFilter() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Kubra");
		name.add("Fathima");
		name.add("Kaneez");
		name.add("Haj");
		name.add("Kulsum");
//convert existing ArrayList into stream [.stream()] u can use [.filter] method and filter method take an argument a lambda expression
		Long c = name.stream().filter(s -> s.startsWith("K")).count();
		System.out.println(c);

		Long d = Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s -> {
			s.startsWith("K");
			return true;
		}).count();
		System.out.println(d);
// print all the names of ArrayList with JavaStream
		//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
// print the first name with JavaStream
		name.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		
	
		

	}

	
	//@Test
	public void streamMap() {
	// print name which have last letter as "a" with Uppercase
		//kubra->KUBRA
		//fathima->FATHIMA
		Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	// print the First name which have last letter as "a" with Uppercase 
		Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).limit(1).forEach(s->System.out.println(s));
	// to print all the name in Uppercase
		 Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	// print name which have first letter as "K" with Uppercase	
		List<String>names = Arrays.asList("Kubra","Fathima", "Kaneez", "Haj", "Kulsum");
		names.stream().filter(s->s.startsWith("K")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	//@Test
	public void streamCocat() {
		// cocatinating two Strings
		List<String> n1 = Arrays.asList("Kubra","Fathima", "Kaneez", "Haj", "Kulsum");
		List<String> n2 = Arrays.asList("Ayesha","suchitra","kaunian");
		Stream<String> newStream = Stream.concat(n1.stream(),n2.stream());
		newStream.map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
	}
	//@Test
	public void streamMatch() {
		// to see whether Kubra is present in the list or not
		List<String> n1 = Arrays.asList("Kubra","Fathima", "Kaneez", "Haj", "Kulsum");
		List<String> n2 = Arrays.asList("Ayesha","suchitra","kaunian");
		Stream<String> newStream = Stream.concat(n1.stream(),n2.stream());
		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Kubra"));
		System.out.println(flag);
		Assert.assertTrue(flag);
}
	//@Test
	public void streamCollect()
	{
		// converting Stream into List
	List<String> ls	= Stream.of("Kubra", "Fathima", "Kaneez", "Haj", "Kulsum").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));	
	}
	@Test
	public void streamAss() {
		List<Integer> num = Arrays.asList(3,2,2,5,1,9,7);
		// print unique from this array
		//num.stream().distinct().forEach(s->System.out.println(s));
		// sort the array [accending order]use sort method
		//num.stream().distinct().sorted().forEach(s->System.out.println(s));
		// to get 3rd index
		List<Integer> number= num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(number.get(3));
		
		 
	}
	
	
}
