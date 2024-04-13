
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
    public double biayaSewa(int lamaSewa) {

        return this.biayaTanpaDiskon(lamaSewa) - this.diskon(lamaSewa);
    }

    public double diskon(int lamaSewa) {
        return lamaSewa > 10 ? 0.1 * this.biayaTanpaDiskon(lamaSewa) : 0;
    }

    public int biayaTanpaDiskon(int lamaSewa){
        int additional = lamaSewa > 5 ? 500 * (lamaSewa - 5) : 0;
        int biaya = 5000 + additional;
        return biaya;

    }
}
