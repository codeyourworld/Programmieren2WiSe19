package shoppingList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * ShoppinglistGuiView is a simple GUI which shows a list of items. You have the opportunity to go forward or back. You can add items.
 * @author Stephi
 * @version 1.0
 *
 */
public class ShoppinglistGuiView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton nextButton;
	private JButton prevButton;
	private JLabel dayText;
	private JButton addButton;
	private DefaultListModel<String> listModel = new DefaultListModel<>();

	/**
	 * Shows a list of items
	 */
	public ShoppinglistGuiView() {
		super("Einkaufsliste");
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		fillTopRow();
		fillButtomRow();

		listModel.addAll(new ArrayList<String>(20));
		JList<String> list = new JList<>(listModel);
		list.setBackground(new Color(100, 187, 187));
		
		add(list);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	private void fillTopRow() {
		JPanel north = new JPanel();
		add(north, BorderLayout.NORTH);


		north.setLayout(new GridBagLayout());
		north.setBackground(Color.WHITE);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;

		ImageIcon icon = new ImageIcon("hausaufgaben/shoppingList/assets/prev20.jpg");
		prevButton = new JButton(icon);
		prevButton.setBackground(Color.white);

		c.weightx = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		north.add(prevButton, c);

		dayText = new JLabel("Einkaufsliste - Tag 1");
		dayText.setBackground(Color.WHITE);
		dayText.setHorizontalAlignment(JLabel.CENTER);
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 1;
		c.gridx = 1;
		c.gridy = 0;
		north.add(dayText, c);

		nextButton = new JButton(new ImageIcon("hausaufgaben/shoppingList/assets/next20.jpg"));
		nextButton.setBackground(Color.white);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.gridx = 2;
		c.gridy = 0;
		north.add(nextButton, c);

	}
	
	private void fillButtomRow() {
		JPanel south = new JPanel();
		add(south, BorderLayout.SOUTH);


		south.setLayout(new GridBagLayout());
		south.setBackground(Color.WHITE);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;


		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 1;
		c.gridx = 0;
		c.gridy = 0;
		south.add(label, c);

		ImageIcon icon = new ImageIcon("hausaufgaben/shoppingList/assets/add20.png");
		addButton = new JButton(icon);
		addButton.setBackground(Color.white);

		c.weightx = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		south.add(addButton, c);
		

	}
	
	
	/**
	 * 
	 * @return the next button
	 */
	public JButton getNextButton() {
		return nextButton;
	}
	
	/**
	 * 
	 * @return the previous button
	 */
	public JButton getPrevButton() {
		return prevButton;
	}

	
	/**
	 * Shows a list of the day
	 * @param listForDay list to show
	 */
	public void showDay(ArrayList<String> listForDay) {
		listModel.removeAllElements();
		listModel.addAll(listForDay);
		repaint();
	}

	/**
	 * Sets the text as a title of the list
	 * @param text
	 */
	public void setLabelText(String text) {
		dayText.setText(text);
		repaint();
	}

	/**
	 * 
	 * @return the add button
	 */
	public JButton getAddButton() {
		return addButton;
	}
	
	
}
