import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new TiketEkonomi("E01", "-", "Bandung", 100000));
        daftarTiket.add(new TiketBisnis("B01", "-", "Jakarta", 150000));
        daftarTiket.add(new TiketEkonomi("E02", "-", "Surabaya", 120000));
        daftarTiket.add(new TiketBisnis("B02", "-", "Bandung", 180000));

        System.out.println("=== DAFTAR TIKET ===");
        daftarTiket.forEach(t ->
            System.out.println(t.kode + " | " + t.tujuan + " | Rp." + t.hitungHarga())
        );

        try {
            System.out.print("\nMasukkan kode tiket: ");
            String kodeInput = input.nextLine();

            if (kodeInput.isEmpty()) {
                throw new Exception("Kode tiket tidak boleh kosong!");
            }

            System.out.print("Masukkan nama pemesan: ");
            String namaInput = input.nextLine();

            if (namaInput.isEmpty()) {
                throw new Exception("Nama tidak boleh kosong!");
            }

            System.out.print("Jumlah tiket: ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                throw new Exception("Jumlah tiket harus lebih dari 0!");
            }
            Optional<Tiket> tiketDipilih = daftarTiket.stream()
                    .filter(t -> t.kode.equalsIgnoreCase(kodeInput))
                    .findFirst();

            if (tiketDipilih.isPresent()) {

                Tiket t = tiketDipilih.get();
                t.nama = namaInput;

                int total = t.hitungHarga() * jumlah;

                System.out.println("\n=== STRUK PEMESANAN ===");
                t.cetakInfo();
                System.out.println("Jumlah : " + jumlah);
                System.out.println("Total  : Rp." + total);

            } else {
                throw new Exception("Tiket tidak ditemukan!");
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Input jumlah harus angka!");

        } catch (Exception e) {
            System.out.println("EeRROR: " + e.getMessage());

        } finally {
            System.out.println("\nProgram selesai (tidak crash 👍)");
        }
    }
}