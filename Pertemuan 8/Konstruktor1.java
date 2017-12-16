public class Konstruktor1 {
	String nama;

	Konstruktor1 () { 
	//konstruktor yang dideklarasikan di awal
		this.nama = "Annisa"; 
		this.printNama();
	}

	public void printNama() {
		System.out.println (nama);
	}

	public static void main (String[] args) {
		Konstruktor1 mhs = new Konstruktor1();
	}

}