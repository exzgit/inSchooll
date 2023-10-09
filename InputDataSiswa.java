import java.util.Scanner;

public class InputDataSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama siswa (tipe data string)
        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        // Input kelas (tipe data int)
        System.out.print("Masukkan kelas: ");
        int kelas = input.nextInt();

        // Input usia (tipe data double)
        System.out.print("Masukkan usia: ");
        double usia = input.nextDouble();

        // Input absen (tipe data float)
        System.out.print("Masukkan absen: ");
        float absen = input.nextFloat();

        // Menampilkan data yang telah diinput
        System.out.println("Data siswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Usia: " + usia);
        System.out.println("Absen: " + absen);
    }
}
