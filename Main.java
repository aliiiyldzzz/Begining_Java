package intro;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		//değişken isimlendirmeleri Java da camelCase ile yazılır.
		String altMetin = "İlginizi çekebilir.";
		String ortaMetin = "Vade süresi";
		
		System.out.println(altMetin);
		
		//integer = Tam sayı ifadesi
		int vade = 20;
		
		//double = Ondalıklı ifade
		double dolarDun = 19.845;
		double dolarBugun = 16.845;
		
		//conditonal = Şartlı ifade
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if (dolarBugun == dolarDun){
			okYonu = "same.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		
	}

}
