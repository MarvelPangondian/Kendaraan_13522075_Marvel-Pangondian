
// Kelas Mobil
public class Mobil extends Kendaraan {
    private String supir;

    public Mobil(){
        super();
        this.supir = "XXXX";
    }

    public Mobil(int nomor, String merk, int tahunKeluaran, String supir) {
        super(nomor, merk, tahunKeluaran, "Mobil");
        this.supir = supir;
    }


    @Override
    public void printInfo() {
        System.out.println("Mobil: " + merk + ", Tahun: " + tahunKeluaran + ", Supir: " + supir);
    }

    @Override
    public double biayaSewa(int lamaSewa) {
        return 500 * lamaSewa;
    }
}
