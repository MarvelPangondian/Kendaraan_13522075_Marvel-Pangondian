
// Kelas Mobil
public class Mobil extends Kendaraan {
    private String supir;

    // Default constructor
    public Mobil(){
        super();
        this.supir = "XXXX";
    }

    // User defined constructor
    public Mobil(int nomor, String merk, int tahunKeluaran, String supir) {
        super(nomor, merk, tahunKeluaran, "Mobil");
        this.supir = supir;
        
    }

    // Copy constructor
    public Mobil(Mobil origin){
        super();
        this.nomor = origin.nomor;
        this.merk = origin.merk;
        this.tahunKeluaran = origin.tahunKeluaran;
        this.supir = origin.supir;
    }


    @Override
    public void printInfo() {
        System.out.println("Mobil: " + merk + ", Nomor: " + this.nomor + ", Tahun: " + tahunKeluaran + ", Supir: " + supir);
    }

    @Override
    public double biayaSewa(int lamaSewa) {
        return 500 * lamaSewa;
    }
}
