package aufgabe5.threads;

import java.io.File;

import mailService.MailService;


public class TimeChecker extends Thread {

	private String time;

	/**
	 * Needs a time in format of hh:mm.
	 * @param time
	 */
	public TimeChecker(String time) throws WrongTimeFormatException {
		if(!TimeService.validateTimeString(time)) {
			throw new WrongTimeFormatException("Time format is invalid (" + time + ". The format needs to be like hh:mm e.g. 12:23");
		} else {
			this.time = time;
		}
	}
	
	@Override
	public void run() {
		
		while(true) {
			String currentTime = TimeService.getCurrentTime();
			if(currentTime.equals(time)) {
				AudioService.play(new File("Path to your audio file"));

				try {
					MailService.write("your mail address", "Subject", "cooler Content");
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	
	public static void main(String[] args) {
		TimeChecker timeChecker;
		try {
			timeChecker = new TimeChecker("12:17");
			timeChecker.start();
		} catch (WrongTimeFormatException e) {
			e.printStackTrace();
		}
		
	}
}
