package alarm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlarmClockTest {

	@Test
	void testIsAlarmNow() {
		AlarmClock wecker = new AlarmClock("12:00", "13:00", true);
		
//		assertEquals(false, wecker.isAlarmNow());
		assertFalse(wecker.isAlarmNow());
		
		wecker.setAlarmTime("12:00");
		wecker.setAlarmSet(false);
		assertFalse(wecker.isAlarmNow(), "Uhrzeit = Weckzeit, aber wecker nicht an, sollte nicht klingeln");
		
		wecker.setAlarmSet(true);
		assertTrue(wecker.isAlarmNow());
	}

}
