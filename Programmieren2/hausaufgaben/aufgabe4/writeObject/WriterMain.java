package aufgabe4.writeObject;

public class WriterMain {
	
	public static void main(String[] args) {

		Model model = Writer.readModel();
		if(model == null) {
			model = new Model();
			model.initList();
		}
		
		System.out.println("List of day:");
		for(String item : model.getListForDay()) {
			System.out.println(item);
		}
				
		Writer.writeModel(model);
		
	}

}
