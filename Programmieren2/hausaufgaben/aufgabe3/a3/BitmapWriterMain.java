package aufgabe3.a3;

import java.io.File;

public class BitmapWriterMain {

	public static void main(String[] args) {
		BitmapWriter bitmapWriter = new BitmapWriter();
		bitmapWriter.writeHeader(new File("C:\\Users\\Stephi\\Desktop\\cooleBMP.bmp"), 1000, 2000);
	}
}
