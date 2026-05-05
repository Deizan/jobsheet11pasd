package Tugas;

public class QueueLinkedList16 {
    private NodeQueue16 front; // kepala antrian (dequeue dari sini)
    private NodeQueue16 rear;  // ekor antrian  (enqueue ke sini)
    private int size;
    private final int MAX_CAPACITY = 10; // kapasitas maksimum antrian

    public QueueLinkedList16() {
        front = null;
        rear  = null;
        size  = 0;
    }

    // ===== Cek antrian kosong =====
    public boolean isEmpty() {
        return (front == null);
    }

    // ===== Cek antrian penuh =====
    public boolean isFull() {
        return (size >= MAX_CAPACITY);
    }

    // ===== Mengosongkan antrian =====
    public void clear() {
        front = null;
        rear  = null;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // ===== Menambahkan antrian (enqueue) =====
    public void enqueue(MahasiswaQueue16 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah mahasiswa.");
            return;
        }
        NodeQueue16 ndBaru = new NodeQueue16(mhs, null);
        if (isEmpty()) {
            front = ndBaru;
            rear  = ndBaru;
        } else {
            rear.next = ndBaru;
            rear = ndBaru;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    // ===== Memanggil / melayani antrian (dequeue) =====
    public MahasiswaQueue16 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dapat dilayani.");
            return null;
        }
        MahasiswaQueue16 dilayani = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dilayani;
    }

    // ===== Menampilkan antrian terdepan =====
    public void tampilFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilInformasi();
        }
    }

    // ===== Menampilkan antrian paling akhir =====
    public void tampilRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilInformasi();
        }
    }

    // ===== Menampilkan jumlah mahasiswa yang masih mengantri =====
    public int jumlahAntrian() {
        return size;
    }

    // ===== Menampilkan seluruh isi antrian =====
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("===== DAFTAR ANTRIAN (" + size + " mahasiswa) =====");
            NodeQueue16 tmp = front;
            int urutan = 1;
            while (tmp != null) {
                System.out.println("No. " + urutan + " :");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                urutan++;
            }
            System.out.println("=========================================");
        }
    }
}
