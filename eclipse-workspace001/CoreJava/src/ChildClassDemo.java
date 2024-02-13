
public class ChildClassDemo extends ParentClassDemo {
	public void engine()
	{
		System.out.println("new engine");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public void AudioSystem()
	{
		System.out.println("new child audiosystem");//function overriding
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Inheritance from ParentClassDemo
		ChildClassDemo ch = new ChildClassDemo();
		ch.colour();
		ch.Brakes();
		ch.Gear();
		ch.AudioSystem();//function overriding
	}

}
