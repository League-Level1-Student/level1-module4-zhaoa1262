package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	
	
	
	
	private static void makeButtons() {
		JFrame frame = new JFrame();
		JButton joke = new JButton();
		JButton punchline = new JButton();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		joke.setText("joke");
		punchline.setText("punchline");
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		joke.addActionListener(this);
		
		
		
	}
	
	
	public static void main(String[] args) {
		makeButtons();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
