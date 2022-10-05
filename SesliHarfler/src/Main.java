
public class Main {
	
	public static void main(String[] args) {
		
		char harf = 'E';
		
		if(harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U' ) {
			System.out.println(harf + " harfi kalın sesli bir harftir.");
		}
		else if(harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü'){
			System.out.println(harf + " harfi ince sesli bir harftir.");
		}
		
		else {
			System.out.println("Geçersiz karakter.");
		}
	}

}
