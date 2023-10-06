
public class Main {
  
  public static void main(String[] args) {
    String nama = "EZRA VALENNE TOFA"; // Inisialisasi nama siswa ke dalam string nama
    int noAbsen = 8; // Inisialisasi Nomor Absensi siswa ke dalam integer noAbsen
    String kelas = "XI PPLG"; // Inisialisasi kelas siswa ke dalam string kelas
    int nilaiPBO = 99; // Inisialisasi nilai mapel PBO siswa ke dalam integer nilaiPBO
    int nilaiBIN = 89; // Inisialisasi nilai  mapel BIN siswa ke dalam integer nilaiBIN
    int nilaiMTK = 75; // Inisialisasi nilai  mapel MTK siswa ke dalam integer nilaiMTK

    final String[] MATA_PELAJARAN = {"PBO", "BIN", "Matematika"}; // Inisialisasi array MATA_PELAJARAN dengan beberapa mapel

    System.out.println("Nama\t\t: " + nama); // Implementasikan Output nama
    System.out.println("No. Absen\t: " + noAbsen); // Implementasikan Output noAbsen
    System.out.println("Kelas\t\t: " + kelas); // Implementasikan Output kelas
    System.out.println("Nilai\t\t: "); // Implementasikan Output Nilai (PBO, BIN, MTK)
    for (String pelajaran : MATA_PELAJARAN) { // Inisialisasi pelajaran pada MATA_PELAJARAN menggunakan loop for
      if (pelajaran.equals("PBO")) { // Inisialisasi Conditional pelajaran PBO
         System.out.println("\t" + pelajaran + "\t: " + nilaiPBO); // Implementasikan pelajaran dan nilaiPBO dalam Output
      } else if (pelajaran.equals("BIN")) { // Inisialisasi Condtional dengan cara yang sama namun ini akan di eksekusi ketika if sudah di eksekusi
         System.out.println("\t" + pelajaran + "\t\t: " + nilaiBIN); // Imolementasikan pelajaran dan nilaiBIN ke dalam Output
      } else { // Inisialisasi Conditional jika tidak / tidak
         System.out.println("\t" + pelajaran + "\t: " + nilaiMTK); // Implementasi pelajaran dan nilaiMTK ke dalam Output
      }
    }
  }
}


//    Copyright by Exzgit-github-repo
//    Github: www.github.com/inSchooll
//    Webs Porto: www.exz.free.nf
