
public class ChildLevel extends ChildClassDemo{
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Function overloading
		ChildLevel c = new ChildLevel();
		c.getData(2);
		c.getData("Kubra");
		c.getData(3, 4);

	}

}
