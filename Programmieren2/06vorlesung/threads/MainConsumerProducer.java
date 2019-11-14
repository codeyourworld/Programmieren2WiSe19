package threads;

import java.util.concurrent.LinkedBlockingQueue;

public class MainConsumerProducer {
	
	public static void main(String[] args) {
		LinkedBlockingQueue<Bread> breads = new LinkedBlockingQueue<>(10);
		Bakery bakery = new Bakery(breads);
		Consumer consumer = new Consumer(breads);
		bakery.start();
		consumer.start();
	}

}
