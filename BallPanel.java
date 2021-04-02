package demo;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

class BallPanel extends JPanel {
	private int delay = 10;
	private PriorityQueue<Ball> list = new PriorityQueue(Collections.reverseOrder());
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public BallPanel() {
		timer.start();
		this.addMouseListener(new MouseListener() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    }

			@Override
			public void mousePressed(MouseEvent e) {
				int x=e.getX();
			    int y=e.getY();
			    for(Ball nextBall : list) {
					double distance = BallPanel.distance(x, y, nextBall.x, nextBall.y);
					
					if(nextBall.radius>=distance) {
						list.remove(nextBall);
						break;
					}
				}
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public void add() {
		list.offer(new Ball());
		System.out.println("Queue");
		for(Ball ball: list) {
			System.out.println(ball.radius);
		}
		
	}

	public void subtract() {
		if (list.size() > 0)
			list.poll(); // Remove the first ball from the queue
		System.out.println("Queue");
		for(Ball ball: list) {
			System.out.println(ball.radius);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball ball : list) {
			
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
		}
		ArrayList<Ball> remove = new ArrayList<>();
		for(Ball ball : list) {
			if(!remove.contains(ball)) {
			for(Ball nextBall : list) {
				
				if(nextBall != ball) {
				int rad = ball.radius + nextBall.radius;
				double distance = BallPanel.distance(ball.x, ball.y, nextBall.x, nextBall.y);
				
				if(rad>=distance) {
					remove.add(nextBall);
					ball.radius+=nextBall.radius;
						}
					}
				}
			}
		}
		list.removeAll(remove);
	}
	public static double  distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(Math.abs(x1-x2), 2))+ Math.pow(Math.abs(y1-y2), 2);
	}
	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}