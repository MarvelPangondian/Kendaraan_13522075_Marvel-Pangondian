// Main untuk testing
public class Main {
    public static void main(String[] args) {
        // Creating instances of Bus, Minibus, and Mobil
        Bus bus = new Bus(101, "Volvo", 2020, 50);
        Minibus minibus = new Minibus(102, "Toyota", 2019);
        Mobil mobil = new Mobil(103, "Honda", 2018, "John Doe");

        // Create a collection for vehicles
        KoleksiKendaraan koleksi = new KoleksiKendaraan();

        // Add vehicles to the collection
        koleksi.addKendaraan(bus);
        koleksi.addKendaraan(minibus);
        koleksi.addKendaraan(mobil);

        // Print information about all vehicles
        koleksi.printAll();

        // Demonstrate the functionality of the Minibus discount method
        System.out.println("Biaya sewa Minibus untuk 5 hari: " + minibus.biayaSewa(5));
        System.out.println("Biaya sewa Minibus untuk 12 hari: " + minibus.biayaSewa(12));
        System.out.println("Diskon Minibus untuk 12 hari: " + minibus.diskon(12));
    }
}
