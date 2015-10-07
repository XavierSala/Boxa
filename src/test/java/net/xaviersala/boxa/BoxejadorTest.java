package net.xaviersala.boxa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoxejadorTest {

  Boxejador joe;

  @Before
  public void setUp() throws Exception {
    joe = new Boxejador("Joe");
  }

  @Test
  public void testQueEsCreaCorrectament() {
    assertEquals("Joe", joe.getNom());
    assertEquals(Boxejador.VIDAPERDEFECTE, joe.getVides());
  }

  @Test
  public void testQueEsCreaCorrectamentSiEsPersonalitzat() {
    Boxejador tmp = new Boxejador("Tmp", 8);
    assertEquals("Tmp", tmp.getNom());
    assertEquals(8, tmp.getVides());
  }

  @Test
  public void testPicaEnUnLlocCorrecte() {
    int cop = joe.clavaCop();
    assertTrue(cop >= 0 && cop < Boxejador.PUNTSDATAC);
  }

  @Test
  public void testNoProtegeixEnUnLloc() {
    int noprotegit = joe.noProtegeix();
    assertTrue(noprotegit >= 0 && noprotegit < Boxejador.PUNTSDATAC);
  }

  @Test
  public void testRepUnCopDescomptaVides() {
    int vides = joe.getVides();

    joe.repCop();
    vides--;
    assertEquals(vides, joe.getVides());

    joe.repCop();
    vides--;
    assertEquals(vides, joe.getVides());
  }

  @Test
  public void testQueCauAlRebreProuCops() {

    int copsARebre = joe.getVides();

    for (int i=0 ; i <= copsARebre; i++) {
      joe.repCop();
    }

    assertTrue(joe.estaKO());
  }

}
