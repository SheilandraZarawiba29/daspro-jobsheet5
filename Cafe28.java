import java.util.Scanner;

public class Cafe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        
    System.out.print("Masukkan menu: ");
    Menu = sc.nextLine();
    System.out.print("Masukkan ukuran cup: ");
    ukuranCup = sc.next().charAt(0);
    System.out.print("Masukkan jumlah: ");
    jumlah = sc.nextInt();
    System.out.print("Masukkan keaggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();

    double hargamenu = 0;

    switch (Menu.toLowerCase()) {
        case "kopi":
            hargamenu = 12000;
            break;
        case "teh":
            hargamenu = 7000;
            break;
        case "coklat":
            hargamenu = 20000;
            break;
    }

    double Totalharga = hargamenu * jumlah;

    switch (ukuranCup) {
        case 'S':
            break;
        case 'M':
            Totalharga += 0.25 * Totalharga;
            break;
        case 'L':
            Totalharga += 0.4 * Totalharga;
            break;
    }

    double diskon = keanggotaan ? 0.1 : 0;
    double nominalBayar = Totalharga - (diskon * Totalharga);

    System.out.println("Item pembelian: " + jumlah + " " + Menu + " dengan ukuran cup " + ukuranCup);
    System.out.println("Nominal bayar: " + nominalBayar);
}
}
