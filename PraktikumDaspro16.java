import java.util.Scanner;

public class PraktikumDaspro16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di KEDAI KOPI SENJA");
        
        int hargaPerCup = 18000;
        
        System.out.println("Anda ingin membeli berapa cup Susu Gula Aren?");
        int jumlahCup = sc.nextInt();

        System.out.println("Silakan memasukkan jumlah uang tunai anda!");
        int uangBayar = sc.nextInt();

        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga*10/100;
        } else {
            
        }
        totalBayar = totalHarga-diskon;

        System.out.printf("%-25s : Rp %d%n", "Total Harga", totalHarga);
        System.out.printf("%-25s : Rp %d%n", "Diskon", diskon);
        System.out.printf("%-25s : Rp %d%n", "Total Bayar", totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar-totalBayar;
            System.out.printf("%-25s : Rp %d%n", "Kembalian", kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.printf("%-25s : Rp %d%n", "Uang tidak cukup kurang", kurang);
        }
    }
}