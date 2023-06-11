package Contest;

class VVIP extends TiketKonser {
    public VVIP(String jenisTiket, double totalHarga) {
        super("UNLIMITED EXPERIENCE", 150);
    }

    public double hitungHarga() {
        return 150;
    }
}