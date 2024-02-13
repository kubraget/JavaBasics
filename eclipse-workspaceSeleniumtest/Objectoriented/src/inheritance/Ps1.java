package inheritance;

import org.testng.annotations.Test;

// Child class
public class Ps1 extends Ps {
	@Test
	public void testRun() {
		int a = 3;
		PS2 ps2 = new PS2(3);
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.MuitiplyBytwo());
		System.out.println(ps2.MuitiplyBythree());
	}

}
