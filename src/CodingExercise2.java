import javax.swing.JOptionPane;

public class CodingExercise2 {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(x);
	int year = 2016 - age;
	if(age >= 30){
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
	}
	else{
		JOptionPane.showMessageDialog(null, "You were born in " + year );
	}
}
}
