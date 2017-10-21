public class Mahasiswa{
	public static void main (String[] args){
	System.out.println("ini adalah method utama");
	Mahasiswa giri= new Mahasiswa();
	giri.printNama();
	System.out.println(giri.calculateUmur());
	}
public void printNama(){
	System.out.println("giri");
}
public int calculateUmur(){
	int tahun_lahir=1998;
	int tahun_sekarang=2017;
	int umur;
	umur=  tahun_sekarang-tahun_lahir;
	return(umur);
}
}