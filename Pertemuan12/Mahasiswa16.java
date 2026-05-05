package Pertemuan12;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa16() {
    }

    public Mahasiswa16(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-12s %-6s %.1f%n", nama, nim, kelas, ipk);
    }
}
