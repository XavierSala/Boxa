package net.xaviersala.boxa;

import java.util.Random;

public class Boxejador {

    private static final int VIDAPERDEFECTE = 5;
    public static final int PUNTSDATAC = 4;

    Random aleatori = new Random();

    private String nom;
    private int vides;


    public Boxejador(String nomBoxejador) {
      nom = nomBoxejador;
      vides = VIDAPERDEFECTE;
    }

    public Boxejador(String nomBoxejador, int vida) {
      nom = nomBoxejador;
      vides = vida;
    }

    public int clavaCop() {
      return aleatori.nextInt(PUNTSDATAC);
    }

    public int noProtegeix() {
       return aleatori.nextInt(PUNTSDATAC);
    }

    public void repCop() {
      vides -= 1;
    }

    public boolean estaKO() {
      return (vides == 0);
    }

    public String getNom() {
      return nom;
    }

    public String toString() {
      return nom + "(" + vides + ")";
    }

}
