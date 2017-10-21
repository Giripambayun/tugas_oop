import java.util.Scanner;
public class InputOutputLagi{
	public static void main(String[] args) {
		Scanner masuk = new Scanner(System.in);
		String nama;
		char jenisKelamin;
		final int tinggiBadan = 12;
		boolean menikah;

		System.out.print("masukan nama: ");
		nama=masuk.nextLine();

		System.out.print("masukan jenis Kelamin: ");
		jenisKelamin=masuk.next().charAt(0);

		System.out.print("masukan tinggi Badan: ");
		tinggiBadan=masuk.nextInt();

		System.out.print("masukan status menikah: ");
		menikah=masuk.nextBoolean();

		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------yang di inputkan--------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("Nama: "+nama);
		System.out.println("jenis Kelamin: "+jenisKelamin);
		System.out.println("tinggi Badan: "+tinggiBadan);
		System.out.println("status: "+menikah);
	}
}