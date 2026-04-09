class TiketEkonomi extends Tiket {

    public TiketEkonomi(String kode, String nama, String tujuan, int harga) {
        super(kode, nama, tujuan, harga);
    }

    @Override
    int hitungHarga() {
        return harga;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Tiket Ekonomi ===");
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Harga  : " + hitungHarga());
    }
}