package Pertemuan12;

import Pertemuan12.Mahasiswa16;
import Pertemuan12.SingleLinkedList16;

public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();

     011("21212203", "Dirga",  "4D", 3.6);

        // ===== Praktikum 2.1 =====
        sll.print();           // kosong

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // ===== Praktikum 2.2 =====
        System.out.print("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
