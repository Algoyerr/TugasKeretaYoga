abstract class Tiket implements CetakTiket {

    protected String kode;
    protected String nama;
    protected String tujuan;
    protected int harga;

    public Tiket(String kode, String nama, String tujuan, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    abstract int hitungHarga();
}