import java.util.Scanner;

public class SIAKAD28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, NIM, nilaiHuruf;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("masukkan nama: ");
        nama = sc.nextLine();
		System.out.print("masukkan NIM: ");
		NIM = sc.nextLine();
		System.out.print("masukkan kelas: ");
		kelas = sc.nextLine(). charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + NIM + ") " + "kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            nilaiHuruf = "A";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Sangat baik");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Lebih dari baik");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Baik");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Lebih dari cukup");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Cukup");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Kurang");
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            System.out.println("Nilai akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: Gagal");
        } 



        
    }

}

