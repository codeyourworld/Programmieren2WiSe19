package aufgabe5.shoppingList;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class ShoppinglistGuiController {

	private ShoppinglistGuiView view;
	private ShoppinglistModel model;
	private static final String fileName = "shoppinglist.data";
	private static final String DAY_TITLE = "Einkaufsliste - Tag ";
	
	public ShoppinglistGuiController() {
		this.view = new ShoppinglistGuiView();
		
		try(FileInputStream fis = new FileInputStream(new File(fileName));
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Object object = ois.readObject();
			if(object instanceof ShoppinglistModel) {
				this.model = (ShoppinglistModel) object;
			} 
		} catch (Exception e) {
		} 
		
		if(model == null) {
			this.model = new ShoppinglistModel();				
		}
		
		view.setLabelText(DAY_TITLE + model.getDay());
		view.showDay(model.getItemOfCurrentDay());
		
		view.getNextButton().addActionListener(l -> {
				model.setDay(model.getDay() + 1);
				view.setLabelText(DAY_TITLE + model.getDay());
				view.showDay(model.getItemOfCurrentDay());
		});

		view.getPrevButton().addActionListener(l -> {
			if(model.getDay() > 1) {
				model.setDay(model.getDay() - 1);
				view.setLabelText(DAY_TITLE + model.getDay());
				view.showDay(model.getItemOfCurrentDay());
			}
		});


		view.getAddButton().addActionListener(l -> {
			boolean cancel = false;
			String item = JOptionPane.showInputDialog("Füge Artikel hinzu:");
			if(item == null || item.matches("^\\s*$")) {
				cancel = true;
			}
			if(!cancel) {
				String repeat = "";
				int value = 0;
				
				while(value == 0 && !cancel) {
					try {
						repeat = JOptionPane.showInputDialog("Wie oft soll dieser Artikel gekauft werden?");
						if(repeat == null || repeat.matches("^\\s$")) {
							cancel = true;
						}
						value = Integer.valueOf(repeat);
					} catch (NumberFormatException e) {
						value = 0;
					}
				}

				if(!cancel) {
					
					try {
						model.setNewItem(item, value);
						view.setLabelText(DAY_TITLE + model.getDay());
						view.showDay(model.getItemOfCurrentDay());
					} catch (ItemExistsException e1) {
						JOptionPane.showMessageDialog(null, "Item alreads exists", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
		});
		

		view.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				
				try(FileOutputStream fos = new FileOutputStream(fileName);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					oos.writeObject(model);
					oos.flush();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Could not safe data", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
	
	
}
