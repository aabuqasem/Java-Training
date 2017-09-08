class Primitives {
	public static void main(String[] args) {
		String name = "Java";
		byte b = 3; //-128 - +127
		short s = 1234;  // -32768 - +32767
		int i = 1234567890;  //-2.1b - + 2.1b
		long e1 = 9876543210L;  // -9.9 - +9.9b
		
		float f = 3.1F;  // 4 bytes
		double d = 3.1;
		
		char c = 'J';
		char returnKey = '\n';
		char backSlash = '\\';
		char tab = '\t';
		char russianYah = '\u042F';   //unicode
		javax.swing.JOptionPane.showMessageDialog(null, "" + russianYah);
		System.out.println(russianYah);
		
		// the caracter escape sequesnces: \n \t \\ \'
		String text = "Each\nWord\nOn\nIts\nOwn\nLine\\";
		String quote = "Mark Twain said, \"No!\"";
		boolean n = false;
		


	}
}
