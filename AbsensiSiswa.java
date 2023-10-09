import java.util.Scanner;

public class AbsensiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: "); //Meminta Input NamaSiswa
        String namaSiswa = input.nextLine(); //Menyimpannya pada string namaSiswa
      
        // Menggunakan switch-case untuk mengecek absensi siswa berdasarkan nama
        switch (namaSiswa) {
            case "Joko":
            case "Santoso":
            case "Dameyo":
                System.out.println(namaSiswa + " dinyatakan HADIR.");
                break;
            default:
                System.out.println(namaSiswa + " dinyatakan BOLOS.");
                break;
        }
    }
}
