package net.xaviersala.boxa;

import java.util.Random;

/**
 * Classe que implementa el comportament d'un boxejador en
 * un combat.
 *
 * @author xavier
 *
 */
public class Boxejador {

    public static final int VIDAPERDEFECTE = 5;
    public static final int PUNTSDATAC = 4;

    private Random aleatori = new Random();

    private String nom;
    private int vides;


    /**
     * Construeix un boxejador amb vida per defecte a partir
     * de un nom.
     * @param nomBoxejador nom del boxejador
     */
    public Boxejador(String nomBoxejador) {
      nom = nomBoxejador;
      vides = VIDAPERDEFECTE;
    }

    /**
     * Construeix un boxejador amb una quantitat determinada de vida.
     * @param nomBoxejador nom del boxejador
     * @param vida vida que ha de tenir
     */
    public Boxejador(String nomBoxejador, int vida) {
      nom = nomBoxejador;
      vides = vida;
    }

    /**
     * El boxejador pica en una de les posicions de l'altre
     * boxejador (0, 1, 2 o 3)
     * @return posició on pica
     */
    public int clavaCop() {
      return aleatori.nextInt(PUNTSDATAC);
    }

    /**
     * El boxejador no protegeix una de les posicions en les
     * que pot rebre un cop.
     *
     * @return posició no protegida
     */
    public int noProtegeix() {
       return aleatori.nextInt(PUNTSDATAC);
    }

    /**
     * El boxejador rep un cop.
     */
    public void repCop() {
      vides -= 1;
    }

    /**
     * @return retorna si el boxejador està KO o no.
     */
    public boolean estaKO() {
      return (vides <= 0);
    }

    /**
     * @return retorna el nom del boxejador.
     */
    public String getNom() {
      return nom;
    }

    /**
     * @return vida del boxejador
     */
    public int getVides() {
      return vides;
    }

    /**
     * Imatge del boxejador en text.
     */
    public String toString() {
      return nom + "(" + vides + ")";
    }

}
