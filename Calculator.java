import java.util.Scanner;

class Calculator {
  // Fungsi tambah
  public double add(double num1, double num2) {
    return num1 + num2;
  }

  // Fungsi kurang
  public double subtract(double num1, double num2) {
    return num1 - num2;
  }

  // Fungsi kali
  public double multiply(double num1, double num2) {
    return num1 * num2;
  }

  // Fungsi bagi
  public double divide(double num1, double num2) {
    if (num2 != 0) {
      return num1 / num2;
    } else {
      System.out.println("Tidak dapat membagi dengan nol.");
      return Double.NaN; // NaN (Not-a-Number) untuk penanganan kesalahan
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Selamat datang di Kalkulator bobrok");

    System.out.print("Daftar operator:\n 1. Penjumlahan (+)\n 2. Pengurangan (-)\n 3. Perkalian (*)\n 4. Pembagian (/)\n Pilih operator dengan simbol atau nomor sesuai urutan: ");

    char operatorSymbol = input.next().charAt(0);
    char operator;

    // Memeriksa apakah yang dimasukkan adalah simbol atau nomor
    if (Character.isDigit(operatorSymbol)) {
      // Jika yang dimasukkan adalah nomor, konversi ke simbol
      switch (operatorSymbol) {
        case '1':
          operator = '+';
          break;
        case '2':
          operator = '-';
          break;
        case '3':
          operator = '*';
          break;
        case '4':
          operator = '/';
          break;
        default:
          System.out.println("Pilihan operator tidak valid.");
          return;
      }
    } else {
      // Jika yang dimasukkan adalah simbol, gunakan langsung
      operator = operatorSymbol;
    }

    System.out.print("Masukkan angka pertama: ");
    double num1 = input.nextDouble();

    System.out.print("Masukkan angka kedua: ");
    double num2 = input.nextDouble();

    double result = 0.0;

    switch (operator) {
      case '+':
        result = calculator.add(num1, num2);
        break;
      case '-':
        result = calculator.subtract(num1, num2);
        break;
      case '*':
        result = calculator.multiply(num1, num2);
        break;
      case '/':
        result = calculator.divide(num1, num2);
        break;
      default:
        System.out.println("Operator tidak valid.");
        break;
    }

    if (!Double.isNaN(result)) {
      System.out.println("Hasil: " + result);
    }
  }
}
