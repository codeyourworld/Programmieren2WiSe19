package bmp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BitmapWriter {

	
	//width = 1000
	//height = 2000
	//größe insgesamt = width * height * 3 + 14 + 40
	public void writeHeader(File file, int width, int height) {
		
		int size = width * height * 3 + 14 + 40;
		int [] sizeInBytes = getBytes(size);
		int [] widthBytes = getBytes(width);
		int [] heightBytes = getBytes(height);
		int [] dataSize = getBytes(size - 54);
		int [] data = {0x42, 0x4D, 
				sizeInBytes[0], sizeInBytes[1], sizeInBytes[2], sizeInBytes[3], 
				0, 0, 0, 0, 
				54, 0, 0, 0, 
				40, 0, 0, 0, 
				widthBytes[0], widthBytes[1], widthBytes[2], widthBytes[3],
				heightBytes[0], heightBytes[1], heightBytes[2], heightBytes[3],
				1, 0, 24, 0, 
				0, 0, 0, 0,
				dataSize[0], dataSize[1], dataSize[2], dataSize[3],
				0, 0, 0, 0,
				0, 0, 0, 0,
				0, 0, 0, 0,
				0, 0, 0, 0
				};
		
		try(FileOutputStream fos = new FileOutputStream(file);
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos))) {

			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			
			for(int i = 0; i < height * width; i++) {
				writer.write(0xFF);	//blue
				writer.write(0xFF);	//grün
				writer.write(0x00);	//rot
			}
			
			fos.flush();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private int[] getBytes(int number) {
		int [] lowestByte = new int[4];
		for(int i = 0; i < lowestByte.length; i++) {
			lowestByte[i] = number % 256;
			number /= 256;
		}		
		return lowestByte;
	}
	
	
}
