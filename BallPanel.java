import java.awt.Graphics;
import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;

class BallPanel extends JPanel {
	private int delay = 10;
	// static ArrayList<Ball> list = new ArrayList<Ball>();
	static PriorityQueue<Ball> q = new PriorityQueue<Ball>();
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
	}

	public void add() {
		q.offer(new Ball());
	}

	public void subtract() {
		if (q.size() > 0)
			q.poll(); // Remove the last ball
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball ball : q) {
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
		ArrayList<Ball> deadBalls = new ArrayList<Ball>();
		for (Ball ball : q) {
			if (!deadBalls.contains(ball)) {
				for (Ball ball1 : q) {
					if (ball != ball1) {
						if (collision(ball, ball1)) {
							ball.radius += ball1.radius;
							deadBalls.add(ball1);
						}
					}
				}
			}
		}
		q.removeAll(deadBalls);
	}

	public boolean collision(Ball b1, Ball b2) {
		return collision(b1.x, b1.y, b1.radius, b2.x, b2.y, b2.radius);
	}

	public boolean collision(int x1, int y1, int r1, int x2, int y2, int r2) {
		if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= r1 + r2) {
			return true;
		}
		return false;
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