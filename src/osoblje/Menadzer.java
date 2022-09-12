package osoblje;

import java.time.LocalDate;

public class Menadzer extends Zaposleni {

    public Menadzer(String ime, String prezime, LocalDate datumIstekaUgovora) {
        super(ime, prezime, datumIstekaUgovora);
    }

    @Override
    public String toString() {
        return super.ime + " " + super.prezime + " - Menadzer";
    }
}
