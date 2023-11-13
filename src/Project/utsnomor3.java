package Project;

import java.util.Scanner;

public class utsnomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi data produk kosmetik
        String[] kodeBarang = {"K001", "K002", "K003", "K004", "K005", "K006", "K007", "K008", "K009", "K010"};
        String[] namaBarang = {"Produk 1", "Produk 2", "Produk 3", "Produk 4", "Produk 5", "Produk 6", "Produk 7", "Produk 8", "Produk 9", "Produk 10"};
        double[] harga = {50.0, 75.0, 30.0, 100.0, 120.0, 90.0, 60.0, 85.0, 40.0, 110.0};

        // Input data transaksi
        System.out.println("===== APLIKASI PENJUALAN KOSMETIK =====");
        System.out.println("======================================");
        System.out.println("Kode Barang\tNama Barang\tHarga");
        System.out.println("======================================");
        for (int i = 0; i < kodeBarang.length; i++) {
            System.out.println(kodeBarang[i] + "\t\t" + namaBarang[i] + "\t\t" + harga[i]);
        }
        System.out.println("======================================");

        // Mencatat transaksi
        System.out.println("Masukkan jumlah transaksi: ");
        int jumlahTransaksi = input.nextInt();

        double totalInvoice = 0;

        for (int i = 0; i < jumlahTransaksi; i++) {
            System.out.println("Transaksi ke-" + (i + 1));
            System.out.println("Masukkan kode barang: ");
            String kode = input.next();

            // Memeriksa apakah kode barang valid
            int index = -1;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kode)) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Kode barang tidak valid.");
                i--;  // Mengulangi input untuk transaksi ke-i
                continue;
            }

            System.out.println("Masukkan jumlah barang: ");
            int qty = input.nextInt();

            // Menghitung total harga transaksi
            double totalHarga = harga[index] * qty;
            totalInvoice += totalHarga;

            // Menampilkan detail transaksi
            System.out.println("Detail Transaksi:");
            System.out.println("Kode Barang: " + kode);
            System.out.println("Nama Barang: " + namaBarang[index]);
            System.out.println("Harga Barang: " + harga[index]);
            System.out.println("Jumlah Barang: " + qty);
            System.out.println("Total Harga: " + totalHarga);
            System.out.println("===============================");
        }

        // Menampilkan total invoice
        System.out.println("Total Invoice: " + totalInvoice);

        input.close();
    }
}

