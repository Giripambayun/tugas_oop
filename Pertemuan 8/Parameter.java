public class Parameter{

public static void main(String[] args) {

	Parameter tes = new Parameter();
	tes.iniAdalahProsedur("Belajar Java Yuks");
	System.out.println(tes.iniAdalahFungsi("Belajar java Yuks"));
	}

	public void iniAdalahProsedur(String data) {
		System.out.println(data);
	}
	
	public String iniAdalahFungsi(String data) {
		return data;
	}
}	
 
