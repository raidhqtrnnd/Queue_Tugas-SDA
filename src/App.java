import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    private static int banyak, j;

    public static void main(String[] args) throws Exception {
        String nama;

        Queue<String> antrian = new LinkedList<>();

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n--------- ENQUEUE ---------\n");
            System.out.print("Masukkan banyak orang yang memesan Kopi : ");
            banyak = input.nextInt();
            input.nextLine();
            for (int i = 1; i <= banyak; i++) {
                j++;
                System.out.print("\nMasukkan Nama " + j + " : ");
                nama = input.nextLine();
                antrian.add(nama);
            }
        }
        System.out.println("\n-------------------------------");
        System.out.println("--------- Kopi Cafe -----------");
        System.out.println("-------------------------------");
        System.out.println("\nDaftar Antrian    : " + antrian);
        System.out.println("Banyak Antrian   : " + antrian.size());

        System.out.println("\n--------- DEQUEUE and IsEmpty() ---------\n");
        if (!antrian.isEmpty()) {
            System.out.println("Antrian : " + antrian); // is Empty()
            System.out.println("Memproses Antrian : " + antrian.poll()); // Dequeue
            System.out.println("Sisa Antrian : " + antrian);
        } else {
            System.out.println("Antrian Kosong");
        }

        System.out.println("\n--------- Melihat Antrian Pertama ---------\n");
        System.out.println("Proses Antrian : " + antrian.element()); // Dequeue
        System.out.println("Antrian : " + antrian);

        System.out.println("\n-------------------------------");
        System.out.println("--------- Kopi Cafe -----------");
        System.out.println("-------------------------------");
        System.out.println("\nDaftar Antrian    : " + antrian);
        System.out.println("Banyak Antrian   : " + antrian.size());

        System.out.println("\n--------- Clear() ---------\n");
        antrian.clear();
        System.out.println("Apakah antrian kosong ? " + antrian.isEmpty());
    }
}
