package com.company;

import osoblje.Igrac;
import osoblje.Menadzer;
import osoblje.Trener;
import savez.SportskoDrustvo;
import savez.Tim;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // KREIRANJE SPORTSKOG DRUSTVA
        SportskoDrustvo sportskoDrustvo = new SportskoDrustvo("Arena", "Adresa 123V");

        // DATUM ZA ISTEK UGOVORA
        // moze se promeniti putem ovog inputa za odredjen datum
        // i za svakog clana posebno
    //        System.out.println("Do kada traje ugovor za {Clan}: ");
    //        Scanner scanner = new Scanner(System.in);
    //        int dan = Integer.parseInt(scanner.nextLine());
    //        int mesec = Integer.parseInt(scanner.nextLine());
    //        int godina = Integer.parseInt(scanner.nextLine());
    //        LocalDate dt = LocalDate.of(godina, mesec, dan);

        LocalDate dt = LocalDate.of(2023, 8, 15);

        // KREIRANJE PRVOG TIMA
        Tim tim1 = new Tim("Prvi tim");

        // KREIRANJE I DODAVANJE MENADZERA
        Menadzer menadzer1 = new Menadzer("Pera", "Peric", dt);
        tim1.dodajMenadzera(menadzer1);


        // KREIRANJE I DODAVANJE TRENERA
        Trener trener1 = new Trener("Nikola", "Nikolic", dt, "Glavni trener");
        Trener trener2 = new Trener("Zika", "Zikic", dt, "Pomocni trener");
        tim1.dodajTrenera(trener1);
        tim1.dodajTrenera(trener2);


        // KREIRANJE I DODAVANJE IGRACA
        Igrac igrac1 = new Igrac("Jovan", "Jovanovic", dt, "Napad");
        Igrac igrac2 = new Igrac("Marko", "Markovic", dt, "Odbrana");
        Igrac igrac3 = new Igrac("Zoran", "Zoranovic", dt, "Napad");
        tim1.dodajIgraca(igrac1);
        tim1.dodajIgraca(igrac2);
        tim1.dodajIgraca(igrac3);

        // KREIRANJE DRUGOG TIMA
        Tim tim2 = new Tim("Drugi tim");

        Menadzer menadzer2 = new Menadzer("Janko" ,"Jankovic", dt);
        tim2.dodajMenadzera(menadzer2);
        // menadzer3 nece biti dodat jer tim moze imati samo jednog menadzera
        Menadzer menadzer3 = new Menadzer("Petar", "Petrovic", dt);
        tim2.dodajMenadzera(menadzer3);

        Trener trener3 = new Trener("Stojan", "Stojanovic", dt, "Prvi Trener");
        tim2.dodajTrenera(trener3);

        Igrac igrac4 = new Igrac("Andrej", "Andrejic", dt, "Golman");
        tim2.dodajIgraca(igrac4);

        // DODAVANJE TIMOVA U SPORTSKO DRUSTVO
        sportskoDrustvo.dodajTim(tim1);
        sportskoDrustvo.dodajTim(tim2);

//        System.out.println(tim1);

        // TEST ZA ISTEK UGOVORA NEKOG CLANA
        System.out.println("Igracu1 istice ugovor: " + igrac1.getDatumIstekaUgovora());
//        System.out.println(sportskoDrustvo.ukupanBrojIgraca());
//        System.out.println(sportskoDrustvo.ukupanBrojTrenera());
//        System.out.println(sportskoDrustvo.ukupanBrojMenadzera());

        // PRIKAZ CELOG SPORTSKOG DRUSTVA
        System.out.println(sportskoDrustvo);
    }
}