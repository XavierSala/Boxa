package net.xaviersala.boxa;

/**
 * Programa que simula el funcionament de la 'boxa entre cavallers'.
 *
 * @author xavier
 *
 */
public class App {

  public static void main(String[] args) {

    // Creo dos boxejadors
    Boxejador un = new Boxejador("MatxacaCaps");
    Boxejador dos = new Boxejador("DestrossaPilotes");

    // Poso els dos boxejadors en el combat
    Combat combat = new Combat(un,dos);

    // Imprimeixo el guanyador
    System.out.println("\nHa guanyat en " + combat.combat());

  }

}
