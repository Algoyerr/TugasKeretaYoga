class TiketBisnis extends Tiket {

    public TiketBisnis(String kode, String nama, String tujuan, int harga) {
        super(kode, nama, tujuan, harga);
    }

    @Override
    int hitungHarga() {
        return harga + 50000;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Tiket Bisnis ===");
        System.out.println("Kode   : " + kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Harga  : " + hitungHarga());
    }
}