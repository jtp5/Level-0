import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Fibonacci {
public static void main(String[] args) {
	 
	String number = JOptionPane.showInputDialog("Which Fibonacci place would you like to know?");
	int place = Integer.parseInt(number);
	int first = 0;
	int second = 1;
	int answer = 0;
	for (int t = 0; t < place; t++) {
	first = second;
	second = answer;
	answer = first + second;
	}
	JOptionPane.showMessageDialog(null, answer);
}


}
