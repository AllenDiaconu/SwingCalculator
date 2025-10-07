package SwingCalculator;
//Reverse Polish Notation
import javax.swing.SwingUtilities;
public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame calculator = new MainFrame();
			}
		});
	}
}