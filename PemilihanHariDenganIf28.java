import java.util.Scanner;

public class PemilihanHariDenganIf28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka(1-7): ");
        int Angka = sc.nextInt();


        if (Angka >= 1 && Angka <= 5) {
            System.out.println("Weekday");
        } else if (Angka >= 6 && Angka <= 7){
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
