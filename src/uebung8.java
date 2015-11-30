import java.util.*;
public class uebung8 {
	
	public static String erfassen() {
		Scanner sc = new Scanner(System.in);
		String eingabe;		
		System.out.println("Bitte Eingabe machen");
		eingabe = sc.next();
		System.out.println("Ihre Eingabe " + eingabe);		
		return eingabe;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean test = false;
		
		String ueberpruefen = erfassen();
		ueberpruefen = ueberpruefen.toLowerCase();
		int laenge = ueberpruefen.length() - 1;
		char[] chars = ueberpruefen.toCharArray();
		
		
		for (int i = 0; i <= laenge; i++) {
			
			if (chars[i] == chars[laenge-i]) {
				//System.out.println(chars[i] + " = " + chars[laenge-i]);
				test = true;
			} else {
				//System.out.println(chars[i] + " /= " + chars[laenge-i]);
				test = false;
				break;
			}
			
		}
		
		if (test) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Kein Palindrom");
		}
		
		
	}

}
