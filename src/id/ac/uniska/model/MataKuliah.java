package id.ac.uniska.model;

public class MataKuliah {

    int idMakul;
    String namaMakul, singkatanMakul, namaDosen, kontakDosen;
    boolean aktif;

    public MataKuliah(int idMakul, String namaMakul, String singkatanMakul, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMakul = idMakul;
        this.namaMakul = namaMakul;
        this.singkatanMakul = singkatanMakul;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    public int getIdMakul() {
        return idMakul;
    }

    public void setIdMakul(int idMakul) {
        this.idMakul = idMakul;
    }

    public String getNamaMakul() {
        return namaMakul;
    }

    public void setNamaMakul(String namaMakul) {
        this.namaMakul = namaMakul;
    }

    public String getSingkatanMakul() {
        return singkatanMakul;
    }

    public void setSingkatanMakul(String singkatanMakul) {
        this.singkatanMakul = singkatanMakul;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
