
public class FinalDemo {
	public class ParentClass {
	    // A final method that cannot be overridden by subclasses
	    public final void finalMethod() {
	        System.out.println("This is a final method in the ParentClass.");
	    }
	}

	public class SubClass extends ParentClass {
	    // Attempting to override the final method will result in a compilation error
	    // Uncommenting the following method will result in a compilation error
	    /*
	    public void finalMethod() {
	        System.out.println("This is an overridden method in the SubClass.");
	    }
	    */
	}
	public void run() {
        final int i = 4; // final
        SubClass subClass = new SubClass();
        subClass.finalMethod(); // Calls the final method from the ParentClass
        System.out.println(i);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo finaldemo = new FinalDemo();
		finaldemo.run();
	}

}
