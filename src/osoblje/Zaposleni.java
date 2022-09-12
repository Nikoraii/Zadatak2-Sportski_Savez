package osoblje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zaposleni extends Osoba {
    private LocalDate datumPotpisivanjaUgovora;
    private LocalDate datumIstekaUgovora;


    public Zaposleni(String ime, String prezime, LocalDate datumIstekaUgovora) {
        super(ime, prezime);
        potpisiUgovor(datumIstekaUgovora);
    }

    public LocalDate getDatumPotpisivanjaUgovora() {
        return this.datumPotpisivanjaUgovora;
    }

    public String getDatumIstekaUgovora() {
        return this.datumIstekaUgovora.format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));
    }

    public void potpisiUgovor(LocalDate datumIstekaUgovora) {
        this.datumIstekaUgovora = datumIstekaUgovora;
        this.datumPotpisivanjaUgovora = LocalDate.now();
    }
}
