public class Konstruktor {
	String nama;

	public void printNama() {
		System.out.println (nama);
	}

	public static void main (String[] args) {
		Konstruktor mhs = new Konstruktor();
		mhs.nama = "Annisa";
		mhs.printNama();
	}

}