package sifreUretici;

public class Main {
	static String getSifre(int n) {
		
		//rastgele harf sec
		
		String metin = "ABCDEFGĞHIJKLMNOPQRSTUVWXYZ"
					  + "0123456789"
					  + "abcdefgğhijklmnopqrstuvxyz"
					  + "^'%'^%+&&^'+!^^'@!'+^%!";
		
	//stringBugger oluştur.
		StringBuilder sb = new StringBuilder(n);
		
		for(int i = 0; i < n; i++) {
			
		int index 
		= (int)(metin.length()
				* Math.random());
		//sb değişkenine harfleri ekle.
		sb.append(metin.charAt(index));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		//30 karakterlik rastgele şifre oluştur.
		int n= 30;
		
		System.out.println(Main.getSifre(n));
	}
	
}
