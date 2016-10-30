import java.util.Calendar;

import javax.swing.JOptionPane;

public class CodingExercise2 {
public static void main(String[] args) {
	Calendar now = Calendar.getInstance();
	String x = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(x); 
	now.add(Calendar.YEAR, -age);
	int year = now.get(Calendar.YEAR);
	if(age >= 30){
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
	}
	else{
		JOptionPane.showMessageDialog(null, "You were born in " + year );
	}
}
}
