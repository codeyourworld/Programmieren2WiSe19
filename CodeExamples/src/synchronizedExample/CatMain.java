package synchronizedExample;

public class CatMain {

	public static void main(String[] args) {
		Cat garfield = new Cat();
		CatFeeder feeder1 = new CatFeeder(garfield, "Bart");
		CatFeeder feeder2 = new CatFeeder(garfield, "Lisa");
		CatFeeder feeder3 = new CatFeeder(garfield, "Homer");
		
		feeder1.start();
		feeder2.start();
		feeder3.start();
		
	}
	
}
