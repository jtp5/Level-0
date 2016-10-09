import javax.swing.JOptionPane;

public class tres_numeros {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("Please input a number.");
	String b = JOptionPane.showInputDialog("Please input another number.");
	String c = JOptionPane.showInputDialog("Please input a third number.");
	int d = Integer.parseInt(a);
	int e = Integer.parseInt(b);
	int f = Integer.parseInt(c);
	
	if (d > e && e > f){
		System.out.printf("%d %d %d \n", d, e, f);
		System.out.printf("%d %d %d \n", f, e, d);
	}
	if (d > f && f > e){
		System.out.println(d + f + e);
		System.out.println(e + f + d);
	}
	if (e > d && d> f){
		System.out.println(e + d + f);
		System.out.println(f + d + e);
	}
	if (e > f && f > d){
		System.out.println(e + f + d);
		System.out.println(d + f+ e);
	}
	if (f > e && e> d){
		System.out.println(f + e + d);
		System.out.println(d + e + f);
	}
	if (f > d && d > e){
		System.out.println(f + d + e);
		System.out.println(e + d + f);
	}
}
}
