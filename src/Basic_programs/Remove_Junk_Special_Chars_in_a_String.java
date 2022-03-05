package Basic_programs;

public class Remove_Junk_Special_Chars_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "!@#$%^&*()_+ java !@#$%^&*() tutorial";
		System.out.println(name);
		
		/*
		 * -Remove special chars/Chinese/Japanese chars from a String.
		 * a-z = small a to small z
		 * A-Z = Capital A to Capital Z
		 * 0-9 = Number 0 to 9
		 * We use this Regular Expression: [^a-zA-Z0-9] to remove the Junk Characters from a String via replaceAll()	
		 * ^ use to notate the note which means if not this then remove via replaceAll() with nothing
		 * 
		 */
		
		name = name.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("Replaced all junk/special and keep the spaces " + name);

//		name = name.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println("Replaced all junk/special and keep the spaces " + name);
	}

}
