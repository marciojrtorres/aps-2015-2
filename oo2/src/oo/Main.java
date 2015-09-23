package oo;

public class Main {

  public static void main(String[] args) {
    // idealizando o que ele deve fazer (by Felps)
    // projetando (especificando)
    // incluindo testes (assertivas)

    // bem programado != bem projetado
    // funciona / melhor performance e fácil de manter
    // o código deve ser escrito para ser lido


    // random (pseudo-random / pseudo-aleatório)
    // sempre que se modela um objeto se ignora
    // algumas características irrelevantes (cor, tamanho, ...)
    // neste caso, o que importa são os números
    // de 1 a 6 (especificação)
    Dado d1 = new Dado6Faces();
    Dado d2 = new Dado6Faces();

    // instância da ESTRATÉGIA
    Randomizer random = new PiorRandomizerPossivel();
    // setando a ESTRATÉGIA
    d1.setRandomizer(random);
    d2.setRandomizer(random);

    System.out.println(d2.getValor()); // ?

    d1.jogar(); // comando/ação (void)
    int v = d1.getValor(); // consulta/leitura (int)
    System.out.println(v); // de 1 a 6 (não < 1, não > 6)
    System.out.println(v >= 1 && v <= 6);
    d1.jogar();
    v = d1.getValor();
    System.out.println(v); // de 1 a 6 (pode ser o mesmo)
    System.out.println(v >= 1 && v <= 6);
    int v2 = d1.getValor();
    System.out.println(v2 == v); // mesmo número anterior

    Jogo j1 = new Jogo(d1, new Dado128Faces());
    j1.inicia();
    System.out.println(j1.getPontos(4)); // 0
    System.out.println(j1.getPontos(1)); // ?
    System.out.println(j1.getPontos(2)); // ?

    // como fazer um dado de até 18 faces?
    // como fazer um dado com diferente
    // mecanismo de aleatoriedade
    // Padrão de Projeto:
    // Objetivo: trocar o algoritmo em execução
    // Nome: Strategy (Estratégia)
    // Dado d3 = new Dado();

  }

}
