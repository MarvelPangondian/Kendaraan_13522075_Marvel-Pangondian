// Main untuk testing
public class Main {
    public static void main(String[] args) {

        // KoleksiKendaraan
        KoleksiKendaraan listKoleksi = new KoleksiKendaraan(1);


        // Default constructors
        Bus bus1  = new Bus();
        Minibus mini1 =  new Minibus();
        Mobil mobil1 = new Mobil();
        listKoleksi.addKendaraan(bus1);
        listKoleksi.addKendaraan(mini1);
        listKoleksi.addKendaraan(mobil1);
        System.out.println("Test 1===============================================================================");
        listKoleksi.printAll();


        // user defined constructors
        Bus bus2 = new Bus(20,"Love bus", 2020,100);
        Minibus mini2 = new Minibus(199, "Mini love", 2000);
        Mobil mobil2 = new Mobil(99,"Love Mobil",1990,"Marvel Pangondian");
        listKoleksi.addKendaraan(bus2);
        listKoleksi.addKendaraan(mini2);
        listKoleksi.addKendaraan(mobil2);
        System.out.println("Test 2===============================================================================");
        listKoleksi.printAll();


        // Copy constructor
        Bus bus3 = new Bus(bus2);
        Minibus mini3 = new Minibus(mini2);
        Mobil mobil3 = new Mobil(mobil2);
        listKoleksi.addKendaraan(bus3);
        listKoleksi.addKendaraan(mini3);
        listKoleksi.addKendaraan(mobil3);
        System.out.println("Test 3===============================================================================");
        listKoleksi.printAll();


        System.out.println("Biaya sewa  (dalam ribuan) ===============================================================================");
        System.out.println("Biaya sewa bus selama 2 hari : " + bus1.biayaSewa(2));
        System.out.println("Biaya sewa minibus 5 hari : " + mini1.biayaSewa(5));
        System.out.println("Biaya sewa minibus 10 hari : " + mini1.biayaSewa(10));
        System.out.println("Biaya sewa minibus 11 hari (tanpa diskon) : " + mini1.biayaSewa(11));
        System.out.println("Biaya sewa minibus 11 hari (dengan diskon) : " + mini1.biayaDenganDiskon(11));
        System.out.println("Biaya sewa Mobil setelah 5 hari : " + mobil1.biayaSewa(5));
        
        System.out.println("List Koleksi dengan copy constructor =====================================================================");
        // copy koleksi kendaraan
        KoleksiKendaraan listKoleksi2 = new KoleksiKendaraan(listKoleksi);
        listKoleksi2.printAll();

        // addListKendaraan, pengganti operator<<(KoleksiKendaraan)
        listKoleksi2.addListKendaraan(listKoleksi2);
        System.out.println("List koleksi setelah memasukan elemen list lain =========================================================");
        listKoleksi2.printAll();
    }
}
