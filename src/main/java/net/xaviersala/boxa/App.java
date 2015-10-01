package net.xaviersala.boxa;

public class App {

  public static void main(String[] args) {

    // Creo dos boxejadors
    Boxejador un = new Boxejador("MatxacaCaps");
    Boxejador dos = new Boxejador("DestrossaPilotes");

    // Poso els dos boxejadors en el combat
    Combat combat = new Combat(un,dos);

    // Imprimeixo el guanyador mirant el resultat de combat()
    System.out.println("\nHa guanyat en " + combat.combat());

  }

}
