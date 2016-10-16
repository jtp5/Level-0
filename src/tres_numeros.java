import javax.swing.JOptionPane;

public class tres_numeros {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("Please input a number.");
	String b = JOptionPane.showInputDialog("Please input another number.");
	String c = JOptionPane.showInputDialog("Please input a third number.");
	int d = Integer.parseInt(a);
	int e = Integer.parseInt(b);
	int f = Integer.parseInt(c);
	
//	if (d > e && e > f){
//		System.out.printf("%d %d %d \n", d, e, f);
//		System.out.printf("%d %d %d \n", f, e, d);
//	}
//	if (d > f && f > e){
//		System.out.printf("%d %d %d \n", d + f + e);
//		System.out.printf("%d %d %d \n", e + f + d);
//	}
//	if (e > d && d> f){
//		System.out.printf("%d %d %d \n", e + d + f);
//		System.out.printf("%d %d %d \n", f + d + e);
//	}
//	if (e > f && f > d){
//		System.out.printf("%d %d %d \n", e + f + d);
//		System.out.printf("%d %d %d \n", d + f+ e);
//	}
//	if (f > e && e> d){
//		System.out.printf("%d %d %d \n", f + e + d);
//		System.out.printf("%d %d %d \n", d + e + f);
//	}
//	if (f > d && d > e){
//		System.out.printf("%d %d %d \n", f + d + e);
//		System.out.printf("%d %d %d \n", e + d + f);
//	}
	if (d > e){
		if(e > f){
			System.out.printf("%d %d %d \n", d, e, f);
			System.out.printf("%d %d %d \n", f, e, d);
		}else if(d > f){
			System.out.printf("%d %d %d \n", d + f + e);
			System.out.printf("%d %d %d \n", e + f + d);
		}else{
			System.out.printf("%d %d %d \n", f + d + e);
			System.out.printf("%d %d %d \n", e + d + f);	
		}
	}else{
		if(e > f){
			System.out.printf("%d %d %d \n", e, f, e);
			System.out.printf("%d %d %d \n", e, f, d);
		}else if(d > f){
			System.out.printf("%d %d %d \n", d + f + e);
			System.out.printf("%d %d %d \n", e + f + d);
		}else{
			System.out.printf("%d %d %d \n", f + d + e);
			System.out.printf("%d %d %d \n", e + d + f);	
		}
	}
}
}
