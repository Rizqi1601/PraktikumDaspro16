import java.util.Scanner;

public class StudiKasus2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;
        int dokumenKurang;

        System.out.printf("%-55s : ", "Nama Mahasiswa");
        namaMahasiswa = sc.nextLine();

        System.out.printf("%-55s : ", "Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) ");
        jenisKegiatan = sc.nextLine();

        System.out.printf("%-55s : ", "Jumlah dokumen yang diupload ");
        jumlahDokumen = sc.nextInt();

        System.out.printf("%-55s : ", "Peringkat juara");
        peringkatJuara = sc.nextInt();

        dokumenKurang = 4 - jumlahDokumen;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlahDokumen == 4) {
                if (peringkatJuara == 1 ||
                    peringkatJuara == 2 ||
                    peringkatJuara == 3) {
                    System.out.println("Status : Dokumen lengkap.");
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dokumen tidak lengkap "
                        + "(kurang " + dokumenKurang + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            }
        }
    }
}