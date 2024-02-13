package inheritance;

public class PS2 extends Ps3 {
	int a;
	public PS2(int a) {
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}
	public int increment() {
		// TODO Auto-generated method stub
		a=a+1;
		return a;
	}
}
