public class Literal2 {

	public static void main(String[] args) {

		//All these numbers have the same value: 110		
		
		int dec = 110;          // no prefix --> decimal literal
		int bin = 0b1101110;    // '0b' prefix --> binary literal
		int oct = 0156;         // '0' prefix --> octal literal
		int hex = 0x6E;         // '0x' prefix --> hexadecimal literal


		System.out.println(dec);
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}