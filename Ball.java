import java.awt.Color;

class Ball implements Comparable<Ball> {
	int x = (int) (Math.random() * BallControl.ballPanel.getWidth());
	int y = (int) (Math.random() * BallControl.ballPanel.getHeight()); // Current ball position
	int dx = (int) (Math.random() * 10); // Increment on ball's x-coordinate
	int dy = (int) (Math.random() * 10); // Increment on ball's y-coordinate
	int radius = (int) (Math.random() * 19) + 2; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

	public int compareTo(Ball b) {
		return b.radius - this.radius;
	}
}