package Tugas;

public class MahasiswaQueue16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaQueue16() {}

    public MahasiswaQueue16(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("  NIM   : %s%n", nim);
        System.out.printf("  Nama  : %s%n", nama);
        System.out.printf("  Kelas : %s%n", kelas);
        System.out.printf("  IPK   : %.1f%n", ipk);
    }
}
