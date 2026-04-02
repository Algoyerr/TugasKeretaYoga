abstract class Tiket {

    protected String kodeTiket;
    protected String namaPenumpang;
    protected String tujuan;
    protected int harga;
    protected String tanggal;
    protected String jam;

    // Encapsulation
    private String noTelepon;
    private String nik;

    public Tiket(String kodeTiket, String namaPenumpang, String tujuan, int harga,
                 String tanggal, String jam, String noTelepon, String nik) {

        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.harga = harga;
        this.tanggal = tanggal;
        this.jam = jam;

        this.noTelepon = noTelepon;
        this.nik = nik;
    }

    // Getter (akses resmi)
    public String getNoTelepon() {
        return noTelepon;
    }

    public String getNik() {
        return nik;
    }

    abstract int hitungHarga();
}