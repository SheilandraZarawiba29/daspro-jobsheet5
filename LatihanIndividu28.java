import java.util.Scanner;

public class LatihanIndividu28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = sc.nextInt();

        String kategoriUsia;

        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori usia: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori usia: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori usia: Dewasa");
        } else if (usia > 65) {
            System.out.println("Kategori usia: Lansia");
        } else {
            System.out.println("Input tidak valid!");
        }
    }
}
