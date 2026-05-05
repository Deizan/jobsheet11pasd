package Tugas;

import java.util.Scanner;

public class QueueMain16 {
    static Scanner sc = new Scanner(System.in);
    static QueueLinkedList16 antrian = new QueueLinkedList16();

    public static void main(String[] args) {
        int pilihan;
        System.out.println("============================================");
        System.out.println("  SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ");
        System.out.println("============================================");

        do {
            tampilMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1 -> daftarMahasiswa();
                case 2 -> panggilAntrian();
                case 3 -> antrian.tampilFront();
                case 4 -> antrian.tampilRear();
                case 5 -> antrian.tampilAntrian();
                case 6 -> System.out.println("Jumlah antrian saat ini: " + antrian.jumlahAntrian() + " mahasiswa");
                case 7 -> cekStatus();
                case 8 -> antrian.clear();
                case 0 -> System.out.println("Terima kasih. Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 0);
    }

    static void tampilMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Daftar Antrian (Enqueue)");
        System.out.println("2. Panggil / Layani Antrian (Dequeue)");
        System.out.println("3. Lihat Antrian Terdepan");
        System.out.println("4. Lihat Antrian Paling Akhir");
        System.out.println("5. Tampilkan Semua Antrian");
        System.out.println("6. Jumlah Mahasiswa Mengantri");
        System.out.println("7. Cek Status Antrian");
        System.out.println("8. Kosongkan Antrian");
        System.out.println("0. Keluar");
    }

    static void daftarMahasiswa() {
        if (antrian.isFull()) {
            System.out.println("Antrian penuh! Tidak bisa mendaftar.");
            return;
        }
        System.out.println("=== PENDAFTARAN ANTRIAN ===");
        System.out.print("NIM   : "); String nim   = sc.nextLine();
        System.out.print("Nama  : "); String nama  = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("IPK   : "); double ipk   = sc.nextDouble(); sc.nextLine();

        MahasiswaQueue16 mhs = new MahasiswaQueue16(nim, nama, kelas, ipk);
        antrian.enqueue(mhs);
    }

    static void panggilAntrian() {
        System.out.println("=== MEMANGGIL ANTRIAN ===");
        MahasiswaQueue16 dilayani = antrian.dequeue();
        if (dilayani != null) {
            System.out.println("Mahasiswa yang dipanggil untuk dilayani:");
            dilayani.tampilInformasi();
            System.out.println("Sisa antrian: " + antrian.jumlahAntrian() + " mahasiswa");
        }
    }

    static void cekStatus() {
        System.out.println("Status antrian kosong : " + antrian.isEmpty());
        System.out.println("Status antrian penuh  : " + antrian.isFull());
    }
}
