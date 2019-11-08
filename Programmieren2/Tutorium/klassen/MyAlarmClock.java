package klassen;

public class MyAlarmClock {
	
	public static void main(String[] args) {
		AlarmClock alarmClock = new AlarmClock("8:00", "8:00", true);
		System.out.println(alarmClock.toString());
		System.out.println(alarmClock);
		System.out.println("Klingelt der Wecker gerade ? " + alarmClock.isRingingNow());
	}
}
