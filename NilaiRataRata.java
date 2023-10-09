import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nilai untuk setiap mata pelajaran
        System.out.println("Masukkan nilai untuk setiap mata pelajaran:");
        System.out.print("BIN: ");
        double bin = input.nextDouble();

        System.out.print("MTK: ");
        double mtk = input.nextDouble();

        System.out.print("PBO: ");
        double pbo = input.nextDouble();

        System.out.print("BASIS DATA: ");
        double basisData = input.nextDouble();

        System.out.print("PPL: ");
        double ppl = input.nextDouble();

        System.out.print("IOT: ");
        double iot = input.nextDouble();

        // Menghitung nilai rata-rata
        double rataRata = (bin + mtk + pbo + basisData + ppl + iot) / 6;

        // Menampilkan nilai rata-rata
        System.out.println("Nilai rata-rata adalah: " + rataRata);

        // Menentukan apakah siswa lulus atau tidak (asumsi batas kelulusan 70)
        if (rataRata >= 70) {
            System.out.println("Siswa dinyatakan LULUS.");
        } else {
            System.out.println("Siswa dinyatakan TIDAK LULUS.");
        }
    }
}
