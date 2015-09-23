package oo;

public class Dado128Faces extends Dado {

  @Override // (opcional) sinalizar que está implementando ou sobrescrevendo
  public void jogar() {
    this.valor = (int) (randomizador.random() * 128) + 1;
  }

}
