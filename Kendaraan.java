
// Kelas abstrak kendaraan
public abstract class Kendaraan {
    protected int nomor;
    protected String merk;
    protected int tahunKeluaran;
    protected String kategori;


    // default constructor
    public Kendaraan(){
        this.nomor = 0;
        this.tahunKeluaran = 0;
        this.merk = "XXX";
        this.kategori = "Mobil";

    }

    // User defined constructor
    public Kendaraan(int nomor, String merk, int tahunKeluaran, String kategori) {
        this.nomor = nomor;
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.kategori = kategori;
    }

    // copy constructor
    public Kendaraan(Kendaraan origin){
        this.nomor = origin.nomor;
        this.merk = origin.merk;
        this.tahunKeluaran = origin.tahunKeluaran;
        this.kategori = origin.kategori;
    }

    public abstract void printInfo();
    public abstract double biayaSewa(int lamaSewa);
}
