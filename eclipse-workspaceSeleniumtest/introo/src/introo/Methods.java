package introo;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods d = new Methods();
		String name = d.getName();
		System.out.println(name);
		int num = d.getNum();
		System.out.println(num);
		Methodss d1 = new Methodss();
		char letter = d1.getLetter();
		System.out.println(letter);
		double  dec = d1.getDec();
		System.out.println(dec);

	}

	public String getName() {
		System.out.println("konichiwa");
		return "kubra";
	}

	public static int getNum() {
		System.out.println("aniyo");
		return 11;
	}

}
