package osoblje;

import java.time.LocalDate;

public class Trener extends Zaposleni {
    private String zaduzenje;

    public Trener(String ime, String prezime, LocalDate datumIstekaUgovora, String zaduzenje) {
        super(ime, prezime, datumIstekaUgovora);
        this.zaduzenje = zaduzenje;
    }

    public String getZaduzenje() {
        return zaduzenje;
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Trener (" + this.zaduzenje + ")";
    }
}
