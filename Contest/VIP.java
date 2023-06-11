package Contest;

class VIP extends TiketKonser {
    public VIP(String jenisTiket, double totalHarga) {
        super("VIP", 100);
    }

    public double hitungHarga() {
        return 100;
    }
}