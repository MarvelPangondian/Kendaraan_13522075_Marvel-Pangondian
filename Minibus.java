
// Kelas minibus
public class Minibus extends Kendaraan {

    // Default constructor
    public Minibus(){
        super();
        this.kategori = "Minibus";
    }
    
    // User defined constructor
    public Minibus(int nomor, String merk, int tahunKeluaran) {
        super(nomor, merk, tahunKeluaran, "Minibus");
    }

    // Copy constructor
    public Minibus(Minibus origin){
        super(); 
        this.nomor = origin.nomor;
        this.merk = origin.merk;
        this.tahunKeluaran = origin.tahunKeluaran;
        this.kategori = "Minibus";
    }

    @Override
    public void printInfo() {
        System.out.println("Minibus: " + merk + ", Nomor: " + this.nomor + ", Tahun: " + tahunKeluaran);
    }

    @Override
    public double biayaSewa(int lamaSewa) {

        int additional = lamaSewa > 5 ? 500 * (lamaSewa - 5) : 0;
        int biaya = 5000 + additional;
        return biaya;
    }

    public double diskon(int lamaSewa) {
        return lamaSewa > 10 ? 0.1 * this.biayaSewa(lamaSewa) : 0;
    }

    public double biayaDenganDiskon(int lamaSewa){
        return this.biayaSewa(lamaSewa) - this.diskon(lamaSewa);
    }
}
