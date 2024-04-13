
// Kelas minibus
public class Minibus extends Kendaraan {
    public Minibus(int nomor, String merk, int tahunKeluaran) {
        super(nomor, merk, tahunKeluaran, "Minibus");
    }

    @Override
    public void printInfo() {
        System.out.println("Minibus: " + merk + ", Tahun: " + tahunKeluaran);
    }

    @Override
    public int biayaSewa(int lamaSewa) {
        return 750 * lamaSewa;
    }

    public double diskon(int lamaSewa) {
        return lamaSewa > 10 ? 0.1 * biayaSewa(lamaSewa) : 0;
    }
}
