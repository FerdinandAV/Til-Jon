package entities;

public class Laaner {
    String navn;
    String adresse;
    int postnr;
    int laaner_id;

    public Laaner(String navn, String adresse, int postnr, int laaner_id) {
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.laaner_id = laaner_id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public int getLaaner_id() {
        return laaner_id;
    }

    public void setLaaner_id(int laaner_id) {
        this.laaner_id = laaner_id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr=" + postnr +
                ", laaner_id=" + laaner_id +
                '}';
    }
}