
public class ConstructorDemo {
	//default constructor
	public  ConstructorDemo()
	{
		System.out.println("I am in constructor");
		System.out.println("I am in constructor lecture 1");
	}
	//Parameterized constructor
	public  ConstructorDemo(int a,int b)
	{
		int c =a+b;
		System.out.println(c);
		System.out.println("I am in Parameterized constructor");
	}
	public  ConstructorDemo(String src)
	{
		System.out.println(src);
	}
	public void getData()
	{
		System.out.println("I am in Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(4,5);
		ConstructorDemo cs = new ConstructorDemo("hello");

	}

}
