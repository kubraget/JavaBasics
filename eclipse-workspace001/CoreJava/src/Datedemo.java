import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Date class to get o/p Fri Feb 02 17:26:00 IST 2024
		Date d = new Date();
		System.out.println(d.toString());
//SimpleDateFormat  class to get o/p ["MM/dd/yyyy"]and ["MM/dd/yyyy hh:mm:ss"] format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		

	}

}
