package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame("Slot Machine");
	JPanel panel = new JPanel();
	JButton greg = new JButton();
	JLabel blue;
	JLabel yellow;
	JLabel green;
	
	public void run() {
		frame.setVisible(true);
		greg.setText("spin");
		panel.add(greg);
		greg.addActionListener(this);
		
		try {
			 blue = createLabelImage("blue.jpg");
			panel.add(blue);
			
			 green = createLabelImage("green.png");
			panel.add(green);
			
			yellow = createLabelImage("yellow.jpg");
			panel.add(yellow);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
	String Joeshmo() {
		Random moop = new Random();
		int pete = moop.nextInt(3);
		
		if (pete == 0) {
			return "yellow.jpg" ;
		}
		
		else if (pete == 1) {
			return "green.png" ;
		}
		
		else if (pete == 2) {
			return "blue.jpg" ;
		}
		
		return "";
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.remove(blue);
		panel.remove(yellow);
		panel.remove(green);
		
		String yello=Joeshmo();
		String blu=Joeshmo();
		String gren=Joeshmo();
		
		try {
			 blue = createLabelImage(blu);
			panel.add(blue);
			
			 green = createLabelImage(gren);
			panel.add(green);
			
			yellow = createLabelImage(yello);
			panel.add(yellow);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.pack();
		
		
		if(yello==blu && yello== gren) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
		
	}
	
	
	
}
