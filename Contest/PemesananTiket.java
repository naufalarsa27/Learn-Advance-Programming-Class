package Contest;

class PemesananTiket {
    private String nama;
    private String kodePesanan;
    private String tanggalPesanan;
    private TiketKonser tiket;

    public PemesananTiket(String nama, String kodePesanan, String tanggalPesanan, TiketKonser tiket) {
        this.nama = nama;
        this.kodePesanan = kodePesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.tiket = tiket;
    }

    public PemesananTiket() {
        
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKodePesanan() {
        return kodePesanan;
    }
    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }
    public String getTanggalPesanan() {
        return tanggalPesanan;
    }
    public void setTanggalPesanan(String tanggalPesanan) {
        this.tanggalPesanan = tanggalPesanan;
    }
    public TiketKonser getTiket() {
        return tiket;
    }
    public void setTiket(TiketKonser tiket) {
        this.tiket = tiket;
    }

    

    
}