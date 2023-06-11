
/*
 * UAP PEMLAN 2023
 * DURASI: 120 MENIT
 * TEMPAT PENGERJAAN: DARING/LURING
 * =================================================================
 * Semangat mengerjakan UAP teman-teman
 * Jangan lupa berdoa untuk hasil yang terbaik
 */

package Contest;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat Datang di Pemesanan Tiket Coldplay!");
        System.out.print("Masukkan nama pemesan : ");
        String name = in.nextLine();

        System.out.println("Pilih jenis tiket :\n1. CAT 8\n2. CAT 1\n3. FESTIVAL\n4. VIP\n5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");
        int pilihan = in.nextInt();

        PemesananTiket tiket = new PemesananTiket();

        while (pilihan <= 5) {
            try {
                System.out.println("-".repeat(12) + " Detail Pemesanan " + "-".repeat(12));
                if (pilihan == 1) {
                    TiketKonser cat8 = new CAT8("CAT 8", 10);
                    tiket = new PemesananTiket(name, generateKodeBooking(), getCurrentDate(), cat8);
                    System.out.println("Nama pemesan : " + name);
                    System.out.println("Kode booking : " + generateKodeBooking());
                    System.out.println("Tanggal Pesanan : " + getCurrentDate());
                    System.out.println("Tiket yang dipesan : " + cat8.jenisTiket);
                    System.out.println("Total harga : " + cat8.hitungHarga());
                } else if (pilihan == 2) {
                    TiketKonser cat1 = new CAT1("CAT 1", 20);
                    tiket = new PemesananTiket(name, generateKodeBooking(), getCurrentDate(), cat1);
                    System.out.println("Nama pemesan : " + name);
                    System.out.println("Kode booking : " + generateKodeBooking());
                    System.out.println("Tanggal Pesanan : " + getCurrentDate());
                    System.out.println("Tiket yang dipesan : " + cat1.jenisTiket);
                    System.out.println("Total harga : " + cat1.hitungHarga());
                } else if (pilihan == 3) {
                    TiketKonser FESTIVAL = new FESTIVAL("FESTIVAL", 50);
                    tiket = new PemesananTiket(name, generateKodeBooking(), getCurrentDate(), FESTIVAL);
                    System.out.println("Nama pemesan : " + name);
                    System.out.println("Kode booking : " + generateKodeBooking());
                    System.out.println("Tanggal Pesanan : " + getCurrentDate());
                    System.out.println("Tiket yang dipesan : " + FESTIVAL.jenisTiket);
                    System.out.println("Total harga : " + FESTIVAL.hitungHarga());
                } else if (pilihan == 4) {
                    TiketKonser VIP = new VIP("VIP", 100);
                    tiket = new PemesananTiket(name, generateKodeBooking(), getCurrentDate(), VIP);
                    System.out.println("Nama pemesan : " + name);
                    System.out.println("Kode booking : " + generateKodeBooking());
                    System.out.println("Tanggal Pesanan : " + getCurrentDate());
                    System.out.println("Tiket yang dipesan : " + VIP.jenisTiket);
                    System.out.println("Total harga : " + VIP.hitungHarga());
                } else if (pilihan == 5) {
                    TiketKonser VVIP = new VVIP("CAT 8", 10);
                    tiket = new PemesananTiket(name, generateKodeBooking(), getCurrentDate(), VVIP);
                    System.out.println("Nama pemesan : " + name);
                    System.out.println("Kode booking : " + generateKodeBooking());
                    System.out.println("Tanggal Pesanan : " + getCurrentDate());
                    System.out.println("Tiket yang dipesan : " + VVIP.jenisTiket);
                    System.out.println("Total harga : " + VVIP.hitungHarga());
                }
                break;
            } catch (Exception e) {
                InvalidInputException error = new InvalidInputException("Terjadi Kesalahan");
                System.out.println(error);
            }
        }
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
