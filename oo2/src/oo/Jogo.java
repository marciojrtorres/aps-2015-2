package oo;

public class Jogo {
  // Para implementar o Padrão de Projeto Estratégia:
  // evitar a instanciação (new)
  private Dado dado1; // = new Dado();
  private Dado dado2; // = new Dado();
  // O construtor revela que
  // um Jogo precisa de dois Dados
  public Jogo(Dado d1, Dado d2) {
    this.dado1 = d1;
    this.dado2 = d2;
  }

  private int pontos1;
  private int pontos2;

  public void inicia() {
    // joga e soma os valores 10 vezes
    for (int i = 0; i < 10; i++) {
      dado1.jogar();
      pontos1 += dado1.getValor();
      dado2.jogar();
      pontos2 += dado2.getValor();
    }
  }

  public int getPontos(int jogador) {
    if (jogador == 1) return pontos1;
    if (jogador == 2) return pontos2;
    return 0;
  }

}
