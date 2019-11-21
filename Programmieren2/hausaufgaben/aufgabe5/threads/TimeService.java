package aufgabe5.threads;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeService {

	/**
	 * Returns true if time has the format hh:mm 
	 * @param time
	 * @return
	 */
	public static boolean validateTimeString(String time) {
		boolean retValue = true;
		//check if the time is valid 00:00 - 23:59
		Pattern pattern = Pattern.compile("^([0-1][0-9]|[2][0-3]):[0-5][0-9]$");
		Matcher matcher = pattern.matcher(time);
		if(!matcher.matches()) {	
			retValue = false;
		} 
		return retValue;
	}
	
	
	/**
	 * Return the current time in format of hh:mm.
	 * @return current time
	 */
	public static String getCurrentTime() {
		String currentTime = Calendar.getInstance().getTime().toString();
		
		//splits the String by every white space e.g. tab, new line, space
		String[] dateParts = currentTime.split("\\s");
		
		//gets the time in format of hh:mm from time
		String time = dateParts[3].substring(0, dateParts[3].lastIndexOf(":"));

		return time;
	}
}
