package eddu.smg;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class s7_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList <Integer> num = new LinkedList<>();
		
		JFrame frame = new JFrame("Task 3_7");
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// main containers and Layouts
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		JTextArea numbers = new JTextArea(); 
		numbers.setEditable(false);
		
		JTextField enter = new JTextField();
		mainPanel.add(enter);
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer temp = Integer.parseInt(enter.getText());
				if(!num.contains(temp)) {
					num.add(temp);
				}
				enter.setText("");
				numbers.setText(num.toString());
			}
		});
		
		mainPanel.add(numbers);
		
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Collections.sort(num);
			numbers.setText(num.toString());
		}
		
		});
		mainPanel.add(sortButton);
		
		JButton shuffleButton = new JButton("Shuffle");
		shuffleButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Collections.shuffle(num);
			numbers.setText(num.toString());
			
		}
		
		});
		mainPanel.add(shuffleButton);
		
		JButton reverseButton = new JButton("Reverse");
		reverseButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Collections.sort(num, Collections.reverseOrder());
			numbers.setText(num.toString());
		}
		
		});
		mainPanel.add(reverseButton);
		
		frame.setVisible(true);
		
	}
}













//Scanner in = new Scanner(System.in);
//JFrame frame = new JFrame("7_3");
//frame.setSize(400, 400);
//
//JPanel mainPanel = new JPanel();
//mainPanel.setPreferredSize( new Dimension( 600, 550 ) );
//frame.add(mainPanel);
//mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//
//JPanel upPanel = new JPanel();
//mainPanel.add(upPanel);
//upPanel.setLayout(new BoxLayout(upPanel, BoxLayout.X_AXIS));
//
//JPanel midPanel = new JPanel();
//mainPanel.add(midPanel);
//midPanel.setLayout(new BoxLayout(midPanel, BoxLayout.Y_AXIS));
//
//JPanel downPanel = new JPanel();
//mainPanel.add(downPanel);
//downPanel.setLayout(new BoxLayout(downPanel, BoxLayout.X_AXIS));
//
//JLabel label = new JLabel();
//label.setText("Enter a number: ");
//upPanel.add(label);
//
//TextArea enter = new TextArea();
//upPanel.add(enter);
//
//TextArea num = new TextArea();
//num.setEditable(false);
//midPanel.add(num);
//
//JButton sort = new JButton("Sort");
//JButton shuffle = new JButton("Shuffle");
//JButton reverse = new JButton("Reverse");
//downPanel.add(sort);
//downPanel.add(shuffle);
//downPanel.add(reverse);
//
//LinkedList<String> linkedList = new LinkedList<String>();
////in.addKeyListener(new KeyAdapter() {
////	public void keyPressed(KeyEvent e) {
////		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
////			if(! linkedList.contains(in.getText())) {
////				linkedList.add(in.getText());
////				out.setText(linkedList.toString());
////				in.setText("");
////			
////			}
////		}
////	}
////});
//
//frame.pack();
//// Setting the frame visibility to true
//frame.setVisible(true);