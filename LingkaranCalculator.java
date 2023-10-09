import java.util.Scanner;

public class LingkaranCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta  memasukkan jari-jari atau diameter
        System.out.print("Masukkan jari-jari atau diameter lingkaran: ");
        double radiusOrDiameter = input.nextDouble();

        // Meminta memilih nilai pi
        System.out.println("Pilih nilai pi:");
        System.out.println("1. 22/7");
        System.out.println("2. 3.14");
        System.out.print("Pilihan Anda (1/2): ");
        int choice = input.nextInt();

        double pi;
        if (choice == 1) {
            pi = 22.0 / 7.0;
        } else if (choice == 2) {
            pi = 3.14;
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Menghitung luas lingkaran
        double area = pi * Math.pow(radiusOrDiameter / 2, 2);

        // Menghitung keliling lingkaran
        double circumference = 2 * pi * (radiusOrDiameter / 2);

        // Menampilkan hasil
        System.out.println("Luas lingkaran adalah: " + area);
        System.out.println("Keliling lingkaran adalah: " + circumference);
    }
}
