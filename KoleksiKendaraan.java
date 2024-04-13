import java.util.ArrayList;
import java.util.List;

//  Kelas KoleksiKendaraan
public class KoleksiKendaraan {
    private List<Kendaraan> kendaraanList;

    public KoleksiKendaraan() {
        kendaraanList = new ArrayList<>();
    }

    public void addKendaraan(Kendaraan k) {
        kendaraanList.add(k);
    }

    public void printAll() {
        for (Kendaraan k : kendaraanList) {
            k.printInfo();
        }
    }
}
