package klassen;

public class AlarmClock {
	
	private String alarm;
	private String currentTime;
	private boolean isAlarm;
	
	public AlarmClock(String alarm, String currentTime, boolean isAlarm) {
		this.alarm = alarm;
		this.currentTime = currentTime;
		this.isAlarm = isAlarm;
	}

	/**
	 * @return the alarm
	 */
	public String getAlarm() {
		return alarm;
	}

	/**
	 * @param alarm the alarm to set
	 */
	public void setAlarm(String alarm) {
		this.alarm = alarm;
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
	 * @return the isAlarm
	 */
	public boolean isAlarm() {
		return isAlarm;
	}

	/**
	 * @param isAlarm the isAlarm to set
	 */
	public void setAlarm(boolean isAlarm) {
		this.isAlarm = isAlarm;
	}
	
	
	public boolean isRingingNow() {
		if(alarm.equals(currentTime)) {
			return true;
		}
		else {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlarmClock [alarm=" + alarm + ", currentTime=" + currentTime + ", isAlarm=" + isAlarm + "]";
	}
	
	
	

}
