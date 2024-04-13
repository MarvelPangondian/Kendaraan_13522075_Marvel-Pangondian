
// Kelas abstrak kendaraan
public abstract class Kendaraan {
    protected int nomor;
    protected String merk;
    protected int tahunKeluaran;
    protected String kategori;
    protected static int kendaraan_count = 0;

    // default constructor
    public Kendaraan(){
        this.nomor = kendaraan_count ;
        this.tahunKeluaran = 0;
        this.merk = "XXX";
        this.kategori = "Mobil";
        kendaraan_count++;
    }

    // User defined constructor
    public Kendaraan(String merk, int tahunKeluaran, String kategori) {
        this.nomor = kendaraan_count;
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.kategori = kategori;
        kendaraan_count++;
    }

    // copy constructor
    public Kendaraan(Kendaraan origin){
        this.nomor = kendaraan_count;
        this.merk = origin.merk;
        this.tahunKeluaran = origin.tahunKeluaran;
        this.kategori = origin.kategori;
        kendaraan_count++;
    }

    public abstract void printInfo();
    public abstract double biayaSewa(int lamaSewa);
}
