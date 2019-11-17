package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel();
	Random random = new Random();
	
	public void run() {
		frame.setVisible(true);
		frame.setSize(300, 300);
		int rand = random.nextInt(24);
		drawButtons(rand);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void drawButtons(int random1) {
		
		for(int i = 0; i < 24; i++) {
			if(i==random1) {
				JButton button = new JButton("mole!");
				button.addActionListener(this);
				panel.add(button);
			}
			
			else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
			}
			
		}
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bob = (JButton) e.getSource();
		if( !(bob.getText().equals("mole!")) ) {
			speak("wrong");
		}
			
	
}
}
