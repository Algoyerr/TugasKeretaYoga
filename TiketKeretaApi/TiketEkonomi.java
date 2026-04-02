class TiketEkonomi extends Tiket implements CetakTiket {

    public TiketEkonomi(String kodeTiket, String namaPenumpang, String tujuan, int harga,
                        String tanggal, String jam, String noTelepon, String nik) {

        super(kodeTiket, namaPenumpang, tujuan, harga, tanggal, jam, noTelepon, nik);
    }

    @Override
    int hitungHarga() {
        return harga;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== TIKET EKONOMI ===");
        System.out.println("Kode Tiket : " + kodeTiket);
        System.out.println("Nama       : " + namaPenumpang);
        System.out.println("Tujuan     : " + tujuan);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Jam        : " + jam);

        // akses via getter (encapsulation)
        System.out.println("No HP      : " + getNoTelepon());
        System.out.println("NIK        : " + getNik());

        System.out.println("Harga      : " + hitungHarga());
    }
}