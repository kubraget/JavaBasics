
public class StaticVar {

	String name;// Instance variable ->non-static variables which are defined in a class outside any method, constructor or a block. 
//Each instantiated object of the class has a separate copy or instance of that variable. An instance variable belongs to  a class.
	String address;
	static String city = "Bangalore";//STATIC variable ->. Static variables are declared inside a class but outside of a method starting with a keyword static.
	static int i =0;
	
	static {
		city="Bangalore";//STATIC block->The static blocks can be used for initializing static variables or calling any static method in java
		i= 0;
	}
	public StaticVar(String name, String address)//LOCAL variable ->Variables declared within a method are local variables
	{ 
//assigning local variable to the instance variable{this.LocalVariable=InstanceVariable}
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getCity()//STATIC methods =A static method in Java is a method that is part of a class rather than an instance of that class. Every instance of a class has access to the method. Static methods have access to class variables (StaticVar) without using the class's object (o).
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar o = new StaticVar("Kubra","vasanthnagar");
		StaticVar o1 = new StaticVar("Kaneez","vasanthnagar");
		StaticVar o3 = new StaticVar("syeeda","vasanthnagar");
		o.getAddress();
		o1.getAddress();
		o3.getAddress();
		StaticVar.getCity();//StaticVar(class name) to acess static methods (getCity()).
		o.address="XYZ";//oblect(class object) to acess Instance variable.
		o.getAddress();
	}

}
