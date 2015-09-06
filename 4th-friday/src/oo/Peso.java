package oo;

public class Peso {
  // CONSTANTE
  private static final double GRAMAS_LIBRA = 453.59;
  private static final double GRAMAS_KILO  = 1000.0;

  private int gramas;

  public static Peso emLibras(double libras) {
    return emGramas((int) (libras * GRAMAS_LIBRA));
  }

  public static Peso emKilos(double kilos) {
    return emGramas((int) (kilos * GRAMAS_KILO));
  }

  public static Peso emGramas(int gramas) {
    if (gramas < 0) {
      throw new IllegalArgumentException("valor negativo recebido " + gramas + "g");
    }
    return new Peso(gramas);
  }

  private Peso(int gramas) {
    this.gramas = gramas;
  }

  public int getGramas() {
    return this.gramas;
  }

  public double getKilos() {
    return this.gramas / GRAMAS_KILO;
  }

  public double getLibras() {
    return this.gramas / GRAMAS_LIBRA;
    // números literais no código são conhecidos como
    // Números Mágicos (mau cheiro no código)
    // normalmente são substituídos por constantes
  }

  public String toString() {
    return this.getKilos() + "kg";
  }

}
