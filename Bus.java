// Kelas Bus
public class Bus extends Kendaraan {
    private int kapasitas;

    public Bus(){
        super();
        this.kategori = "Bus";
        this.kapasitas = 0;
    }

    public Bus(int nomor, String merk, int tahunKeluaran, int kapasitas) {
        super(nomor, merk, tahunKeluaran, "Bus");
        this.kapasitas = kapasitas;
    }

    @Override
    public void printInfo() {
        System.out.println("Bus: " + merk + ", Tahun: " + tahunKeluaran + ", Kapasitas: " + kapasitas);
    }

    @Override
    public double biayaSewa(int lamaSewa) {
        return 1000 * lamaSewa;
    }
}
