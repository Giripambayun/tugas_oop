public class Konstruktor2{ 
	String nama;

	Konstruktor2(String nama){
		this.nama = nama;
		this.printNama();
	}

	public void printNama() {
		System.out.println(nama);
	}

	public static void main(String[] args){
		Konstruktor2 mhs = new Konstruktor2("Annisa");
	}
}
