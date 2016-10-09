import javax.swing.text.StyledEditorKit.ForegroundAction;

public class beer {
	public static void main(String[] args) {
		int bottles = 99;
		int newbottles = bottles-1;
		String a = " " + "bottles of beer";
		String b = " on the wall";
		String c = " you take one down and pass it around, ";
	
	for (int i = 0; i < 99; i++) {
//		System.out.println(bottles + a + b + ",");
//		System.out.println(bottles + a + ",");
//		System.out.println(c);
//		bottles--;
//		System.out.println(bottles + a + b + ".");
		System.out.println(bottles + a + b + " " + bottles + a + "," + c + "" + newbottles + a + b + ".");
		bottles--;
		newbottles = bottles-1;
	}
	}
}
