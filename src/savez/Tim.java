package savez;

import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tim {
    private String naziv;
    private List<Igrac> listaIgraca;
    private List<Trener> listaTrenera;
    private Menadzer menadzer;
    int menadzerPomoc = 0;
    private LocalDate datumOsnivanja;

    // POMOCNE VARIJABLE
    int brojIgraca = 0;
    int brojTrenera = 0;

    public Tim(String naziv) {
        this.naziv = naziv;
        this.datumOsnivanja = LocalDate.now();
        this.listaIgraca = new ArrayList<>();
        this.listaTrenera = new ArrayList<>();
    }

    public void dodajIgraca (Igrac igrac) {
        listaIgraca.add(igrac);
        brojIgraca++;
    }

    public void dodajTrenera(Trener trener) {
        listaTrenera.add(trener);
        brojTrenera++;
    }

    public void dodajMenadzera(Menadzer menadzer) {
        if (menadzerPomoc == 0) {
            this.menadzer = menadzer;
            menadzerPomoc++;
        } else {
            System.out.println("Tim moze imati samo jednog menadzera!");
        }
    }



    @Override
    public String toString() {
        listaIgraca.sort(Comparator.comparing(Igrac::getPozicija));
        listaTrenera.sort(Comparator.comparing(Trener::getZaduzenje));
        String datum = this.datumOsnivanja.format(DateTimeFormatter.ofPattern("dd.MM.yyyy."));
        String izlaz = "Tim - " + this.naziv + " (" + datum + ")\n";
        izlaz += "- " + this.menadzer;
        for (Igrac igrac: listaIgraca) {
            izlaz += "\n\t- " + igrac;
        }
        for (Trener trener: listaTrenera) {
            izlaz += "\n\t- " + trener;
        }
        return izlaz + "\n";
    }
}
