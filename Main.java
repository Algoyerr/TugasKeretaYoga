import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // DATA TIKET (LIST)
        List<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new TiketEkonomi("E01", "-", "Bandung", 100000));
        daftarTiket.add(new TiketBisnis("B01", "-", "Jakarta", 150000));
        daftarTiket.add(new TiketEkonomi("E02", "-", "Surabaya", 120000));
        daftarTiket.add(new TiketBisnis("B02", "-", "Bandung", 180000));

        // TAMPILKAN DAFTAR TIKET
        System.out.println("=== DAFTAR TIKET ===");
        daftarTiket.forEach(t ->
            System.out.println(t.kode + " | " + t.tujuan + " | Rp." + t.hitungHarga())
        );

        // INPUT USER
        System.out.print("\nMasukkan kode tiket: ");
        String kodeInput = input.nextLine();

        System.out.print("Masukkan nama pemesan: ");
        String namaInput = input.nextLine();

        System.out.print("Jumlah tiket: ");
        int jumlah = input.nextInt();

        // STREAM → CARI TIKET
        Optional<Tiket> tiketDipilih = daftarTiket.stream()
                .filter(t -> t.kode.equalsIgnoreCase(kodeInput))
                .findFirst();

        if (tiketDipilih.isPresent()) {

            Tiket t = tiketDipilih.get();

            // SET NAMA PEMESAN
            t.nama = namaInput;

            // HITUNG TOTAL
            int total = t.hitungHarga() * jumlah;

            // OUTPUT STRUK
            System.out.println("\n=== STRUK PEMESANAN ===");
            t.cetakInfo();
            System.out.println("Jumlah : " + jumlah);
            System.out.println("Total  : Rp." + total);

        } else {
            System.out.println("Tiket tidak ditemukan!");
        }
    }
}