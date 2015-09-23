package oo;

public abstract class Dado {

  // acessível pelas subclasses (protected)
  protected int valor;
  protected Randomizer randomizador = new RandomizerNulo();

  public Dado() {
    this.jogar();
  }

  // método que permite MUDAR A ESTRATÉGIA
  public void setRandomizer(Randomizer r) {
    this.randomizador = r;
  }

  public abstract void jogar();

  public int getValor() {
    return this.valor;
  }

}
