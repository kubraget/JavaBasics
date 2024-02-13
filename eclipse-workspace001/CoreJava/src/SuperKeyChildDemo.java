
public class SuperKeyChildDemo extends SuperKeyParentDemo {
	
	String name ="kubra";//how to handle  variable in parent and child using superkeyword
	//to handle constructorin parent and child using superkeyword
	public SuperKeyChildDemo()
	{
		super();// this should be always be at first line
		System.out.println("child class constructor");
	}
	// to handel same methods in parent and child using superkeyword
	public void getData()
	{
		super.getData();
		System.out.println("I am child class");
	}
	public void getStringdata()
	{
		System.out.println(name);//outpit = name
		System.out.println(super.name);//super keyword refers to SuperKeyParentDemo //output = Rahul
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyChildDemo child = new SuperKeyChildDemo();
		child.getStringdata();
		child.getData();
	}

}
