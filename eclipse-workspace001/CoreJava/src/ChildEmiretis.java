
public class ChildEmiretis extends ParentAirCraft {
//extends Parent Abstract [ParentAirCraft]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmiretis c = new ChildEmiretis();
		c.engine();
		c.safety();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red colour in the body");
	}

}
