package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TypingTutor implements KeyListener {
JFrame frame = new JFrame("Type or Die");
JLabel label = new JLabel();
char currentLetter;


void run() {
	

currentLetter = generateRandomLetter();

frame.setVisible(true);
frame.add(label);


label.setText(currentLetter + "");
frame.setSize(300, 200);

label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);

frame.addKeyListener(this);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.pack();
}


char generateRandomLetter() {
	
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	System.out.println(e.getKeyChar());
	if(e.getKeyChar() == currentLetter) {
		System.out.println("correct");
		
		frame.setBackground(Color.GREEN);
		
	}
	else {
		
	frame.setBackground(Color.red);
	}
	
	frame.pack();
	
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	
}




}
