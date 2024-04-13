
// Kelas abstrak kendaraan
public abstract class Kendaraan {
    protected int nomor;
    protected String merk;
    protected int tahunKeluaran;
    protected String kategori;

    public Kendaraan(int nomor, String merk, int tahunKeluaran, String kategori) {
        this.nomor = nomor;
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.kategori = kategori;
    }

    public abstract void printInfo();
    public abstract int biayaSewa(int lamaSewa);
}