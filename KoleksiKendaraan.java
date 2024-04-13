//  Kelas KoleksiKendaraan
public class KoleksiKendaraan {
    private Kendaraan[] kendaraanList;
    private int neff;
    private int size;

    // Default constructor
    public KoleksiKendaraan() {
        this.kendaraanList = new Kendaraan[100];
        // this.size = 100; in java, list is dynamically sized
        this.size = 100;
        this.neff = 0;
    }

    // User defined constructor
    public KoleksiKendaraan(int size){
        if (size <= 0 ){
            size = 1;
        }
        this.size = size;
        this.kendaraanList = new Kendaraan[this.size];
        this.neff = 0;
    }

    // Copy constructor
    public KoleksiKendaraan(KoleksiKendaraan origin){
        this.kendaraanList = new Kendaraan[origin.size];
        this.neff = origin.neff;
        this.size = origin.size;

        for (int i = 0 ; i < this.neff ; i++){
            this.kendaraanList[i] = origin.kendaraanList[i];
        }
    }

    public void addKendaraan(Kendaraan k) {
        if (this.neff < this.size){
            //do something;
            this.kendaraanList[this.neff] = k;
            this.neff++;
        }
        else {
            this.size *= 2;
            Kendaraan[] temp = new Kendaraan[this.size];
            for (int i = 0; i < this.neff ; i++){
                temp[i] = this.kendaraanList[i];
            }
            temp[this.neff] = k;
            this.neff++;
            this.kendaraanList = temp;
        }
    }

    // replacement for operator<<(KoleksiKendaraan)
    public void addListKendaraan(KoleksiKendaraan origin){
        int origin_start = 0;
        // fit kendaraan from origin as much as it can
        for (int i = this.neff ; i < this.size ; i++){
            this.kendaraanList[i] = origin.kendaraanList[origin_start];
            this.neff++;
            origin_start++;
        }
    }

    public void printAll() {
        for (int i = 0 ; i < this.neff ; i++){
            this.kendaraanList[i].printInfo();
        }
    }
}
