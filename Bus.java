// Kelas Bus
public class Bus extends Kendaraan {
    private int kapasitas;

    // Default Constructor
    public Bus(){
        super();
        this.kategori = "Bus";
        this.kapasitas = 0;
    }

    // User defined constructor
    public Bus(int nomor, String merk, int tahunKeluaran, int kapasitas) {
        super(nomor, merk, tahunKeluaran, "Bus");
        this.kapasitas = kapasitas;
    }

    // Copy constructor
    public Bus(Bus origin){
        super();
        this.merk = origin.merk;
        this.tahunKeluaran = origin.tahunKeluaran;
        this.kapasitas = origin.kapasitas;

    }

    @Override
    public void printInfo() {
        System.out.println("Bus: " + this.merk + ", nomor: "+ this.nomor +  ", Tahun: " + this.tahunKeluaran + ", Kapasitas: " + this.kapasitas);
    }

    @Override
    public double biayaSewa(int lamaSewa) {
        return 1000 * lamaSewa;
    }
}
