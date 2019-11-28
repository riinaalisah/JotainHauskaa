package jotainhauskaa.vinkkilista.domain;

import java.util.Arrays;

public class KirjaVinkki extends Vinkki {
    private String kirjoittaja;
    private String isbn;
    // private String otsikko;
    // private String tyyppi;    
    // private String kuvaus;
    // private String kommentti;
    // private String[] tagit;
    // private String[] kurssit;
    
    
    
    
    public KirjaVinkki(String kirjoittaja, String otsikko, String tyyppi,
                       String isbn, String kuvaus, String kommentti,
                       String[] tagit, String[] kurssit) {
        
        super(otsikko, tyyppi, kommentti, kuvaus, tagit, kurssit);        
        this.kirjoittaja = kirjoittaja;
        this.isbn = isbn;
    }

    public String getKirjoittaja() {
        return kirjoittaja;
    }


    public String getIsbn() {
        return isbn;
    }


    @Override
    public String toString() {
        return "Kirjoittaja: " + kirjoittaja + "\n"
                + "Otsikko: " + super.getOtsikko() + "\n"
                + "Tyyppi: " + super.getTyyppi() + "\n"                
                + "ISBN: " + isbn + "\n"
                + "Kuvaus: " + super.getKuvaus() + "\n"
                + "Kommentti: " + super.getKommentti() + "\n"
                + "Tagit: " + Arrays.toString(super.getTagit()) + "\n"
                + "Kurssit: " + Arrays.toString(super.getKurssit());
    }
}