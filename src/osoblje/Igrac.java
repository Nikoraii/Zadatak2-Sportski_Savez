package osoblje;

import java.time.LocalDate;

public class Igrac extends Zaposleni {
    private String pozicija;

    public Igrac(String ime, String prezime, LocalDate datumIstekaUgovora, String pozicija) {
        super(ime, prezime, datumIstekaUgovora);
        this.pozicija = pozicija;
    }

    public String getPozicija() {
        return pozicija;
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Igrac (" + this.pozicija + ")";
    }
}
