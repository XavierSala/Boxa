package net.xaviersala.boxa;


public class Combat {

  private static final int NUMERODECOMBATENTS = 2;

  private static final String[] COPS = { "bloquejat per", "al cap de", "al costat esquerra de", 
                                        "al costat dret de", "a la panxa de" };
  Boxejador[] boxejadors = new Boxejador[NUMERODECOMBATENTS];

  /**
   * Construeix un combat a partir de dos boxejadors
   * @param un Primer boxejador
   * @param dos Segon boxejador
   */
  public Combat(Boxejador un, Boxejador dos) {
    boxejadors[0] = un;
    boxejadors[1] = dos;
  }

  /**
   * Simula el combat entre els dos boxejadors.
   *
   * @return Retorna qui és el guanyador
   */
  public String combat() {


    while( !boxejadors[0].estaKO() && !boxejadors[1].estaKO() ) {

      // Primer pica 0 sobre 1
      int que = atacBoxejador(0, 1);
      imprimirLinia(0, que);

      if (!boxejadors[1].estaKO()) {

        // Després pica 1 sobre 0
         que = atacBoxejador(1, 0);
         imprimirLinia(1, que);
      }

    }

    if (boxejadors[0].estaKO()) {
      System.out.println(boxejadors[0] + " està KO!");
      return boxejadors[1].getNom();
    }

    System.out.println(boxejadors[1] + " està KO!");
    return boxejadors[0].getNom();
  }

  /**
   * Imprimeix què passa en l'atac d'un boxejador
   *
   * @param Quin boxejador és
   * @param Quin cop ha donat
   */
  private void imprimirLinia(int i, int que) {
    System.out.println(boxejadors[i] + " cop " + COPS[que+1] + " " + boxejadors[(i+1)%2]);

  }

  /**
   * Funció que simula l'atac d'un boxejador sobre un altre.
   *
   * @param boxejadorQuePica Qui és el que pica
   * @param boxejadorQueRep Qui és el que rep
   */
  private int atacBoxejador(int boxejadorQuePica, int boxejadorQueRep) {
    int cop = boxejadors[boxejadorQuePica].clavaCop();
    int noprotegit = boxejadors[boxejadorQueRep].noProtegeix();

    if (cop == noprotegit) {
      boxejadors[boxejadorQueRep].repCop();
      return cop;
    }
    return -1;
  }

}
