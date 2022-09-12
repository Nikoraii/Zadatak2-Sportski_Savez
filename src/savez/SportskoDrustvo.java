package savez;

import osoblje.Igrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SportskoDrustvo {
    private String naziv;
    private String adresa;
    private List<Tim> listaTimova;

    public SportskoDrustvo(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.listaTimova = new ArrayList<>();
    }

    public void dodajTim(Tim tim) {
        listaTimova.add(tim);
    }

    public int ukupanBrojIgraca() {
        int ukupanBrojIgraca = 0;
        for (Tim tim: listaTimova) {
            ukupanBrojIgraca += tim.brojIgraca;
        }
        return ukupanBrojIgraca;
    }

    public int ukupanBrojTrenera() {
        int ukupanBrojTrenera = 0;
        for (Tim tim: listaTimova) {
            ukupanBrojTrenera += tim.brojTrenera;
        }
        return ukupanBrojTrenera;
    }

    public int ukupanBrojMenadzera() {
        int ukupanBrojMenadzera = 0;
        for (Tim tim: listaTimova) {
            ukupanBrojMenadzera++;
        }
        return ukupanBrojMenadzera;
    }

    @Override
    public String toString() {
        String izlaz = "\nSportsko drustvo: " + this.naziv + ", " + this.adresa
                + "\n-----------------------------------------"
                + "\nBroj igraca: " + ukupanBrojIgraca()
                + "\nBroj trenera: " + ukupanBrojTrenera()
                + "\nBroj menadzera: " + ukupanBrojMenadzera()
                + "\n-----------------------------------------\n";
        for (Tim tim: listaTimova) {
            izlaz += tim + "-----------------------------------------\n";
        }
        return izlaz;
    }
}
