// Kelas Bus
public class Bus extends Kendaraan {
    private int kapasitas;

    public Bus(int nomor, String merk, int tahunKeluaran, int kapasitas) {
        super(nomor, merk, tahunKeluaran, "Bus");
        this.kapasitas = kapasitas;
    }

    @Override
    public void printInfo() {
        System.out.println("Bus: " + merk + ", Tahun: " + tahunKeluaran + ", Kapasitas: " + kapasitas);
    }

    @Override
    public int biayaSewa(int lamaSewa) {
        return 1000 * lamaSewa;
    }
}
