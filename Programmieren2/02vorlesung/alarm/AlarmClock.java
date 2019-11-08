package alarm;

public class AlarmClock {
	
	/*
	 * Schreibe eine Klasse Wecker, die die aktuelle Uhrzeit, die Weckzeit und die Information, 
	 * ob der Wecker gestellt ist beinhaltet. Erstelle Getter und Setter für die Variablen. 
	 * Schreibe eine Methode, die prüfen soll, ob der Wecker gerade klingeln soll.
	 */

	private String currentTime;
	private String alarmTime;
	private boolean isAlarmSet;
	
	
	public AlarmClock(String currentTime) {
		super();
		this.currentTime = currentTime;
		isAlarmSet = false;
		alarmTime = "00:00";
	}


	public AlarmClock(String currentTime, String alarmTime, boolean isAlarmSet) {
		super();
		this.currentTime = currentTime;
		this.alarmTime = alarmTime;
		this.isAlarmSet = isAlarmSet;
	}
	
	public boolean isAlarmNow() {
		if(alarmTime.equals(currentTime)) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * @return the currentTime
	 */
	public String getCurrentTime() {
		return currentTime;
	}
	
	/**
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * @return the alarmTime
	 */
	public String getAlarmTime() {
		return alarmTime;
	}
	
	/**
	 * @param alarmTime the alarmTime to set
	 */
	public void setAlarmTime(String alarmTime) {
		this.alarmTime = alarmTime;
	}
	
	/**
	 * @return the isAlarmSet
	 */
	public boolean isAlarmSet() {
		return isAlarmSet;
	}
	
	/**
	 * @param isAlarmSet the isAlarmSet to set
	 */
	public void setAlarmSet(boolean isAlarmSet) {
		this.isAlarmSet = isAlarmSet;
	}
	
	
	
}
