Pertanyaan 2.1.2
1. Karena sll.print() dipanggil sebelum ada data yang ditambahkan ke linked list. Pada saat itu head == null, sehingga method isEmpty() mengembalikan true dan program mencetak pesan "Linked list kosong".
2. Variabel temp berfungsi sebagai pointer/penunjuk sementara yang digunakan untuk melakukan traversal (penelusuran) menelusuri node-node dalam linked list tanpa mengubah nilai head atau tail. Dengan temp, kita bisa berpindah dari satu node ke node berikutnya (temp = temp.next) sambai menjaga referensi asli linked list tetap aman.
3. sudah

Pertanyaan 2.2.3
1. break digunakan untuk menghentikan loop while segera setelah node yang dicari ditemukan dan dihapus. Tanpa break, loop akan terus berjalan menelusuri sisa node walaupun penghapusan sudah dilakukan, yang bisa menyebabkan error atau penghapusan ganda yang tidak diinginkan.
2. Baris pertama (temp.next = temp.next.next) melakukan penghapusan node dengan cara "melompati" node yang ingin dihapus — node sebelumnya langsung dihubungkan ke node dua langkah ke depan, sehingga node target terputus dari rantai dan akan di-garbage collect oleh Java. Baris if (temp.next == null) mengecek apakah node yang dihapus adalah node terakhir — jika ya, maka tail harus diperbarui menunjuk ke node sebelumnya (temp) agar pointer tail tetap valid.
