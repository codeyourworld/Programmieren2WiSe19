package aufgabe4.writeObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Writer {

	private static final String fileName = "Model.data";
	
	public static void writeModel(Model model) {
		
		try(FileOutputStream fos = new FileOutputStream(new File(fileName));
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(model);
			oos.flush();
		} catch (Exception e) {
			System.err.println("Could not write model to file");
		}
	}
	
	public static Model readModel() {
		Model model = null;

		try(FileInputStream fis = new FileInputStream(new File(fileName));
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Object object = ois.readObject();
			if(object instanceof Model) {
				model = (Model) object;
			}
			
		} catch (Exception e) {
			System.err.println("There was no model to read");
		}
		
		return model;		
	}
	
}
