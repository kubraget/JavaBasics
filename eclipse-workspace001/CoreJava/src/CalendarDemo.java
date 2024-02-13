import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));//02/02/2024 05:38:23
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));//2
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));//1
		System.out.println(cal.get(Calendar.AM_PM));//1[AM=0,PM=1]
		System.out.println(cal.get(Calendar.MINUTE));//38


	}

}
