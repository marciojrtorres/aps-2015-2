package oo;

public class Dado6Faces extends Dado {

  @Override // (opcional) sinalizar que está implementando ou sobrescrevendo
  public void jogar() {
    this.valor = (int) (randomizador.random() * 6) + 1;
  }

}
