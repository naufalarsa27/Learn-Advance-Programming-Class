package Contest;

abstract class TiketKonser implements HargaTiket {
    String jenisTiket;
    double totalHarga;

    public TiketKonser(String jenisTiket, double totalHarga) {
        this.jenisTiket = jenisTiket;
        this.totalHarga = totalHarga;
    }

    public TiketKonser() {
        
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

}
