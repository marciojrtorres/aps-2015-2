package oo;

public class Main {

  public static void main(String[] args) {
    // Modelando a Água (projetando e implementando)
    // Modelar = pegar a idéia e transformar em código!
    // Se usa algumas variáveis e se ignora outras = ABSTRAÇÃO!

    // Agua é uma classe
    // new cria uma instância de Agua (põe na memória)
    Agua a = new Agua();
    // como interagir?
    // Líquida, Sólida ou Gasosa
    // consultando a temperatura
    // System.out.println(a.temperatura); // arbitrário! 21
    // System.out.println(a.temperatura == 21); // true
    System.out.println(a.temperatura() == 21);
    System.out.println(a.temperatura() == 21);
    a.esfriar();
    System.out.println(a.temperatura() == 20);
    a.esfriar(); a.esfriar(); a.esfriar();
    System.out.println(a.temperatura() == 17);

    // !false 16 !false 15  !false 14 ... !true 0
    while ( ! a.estaSolida()) a.esfriar();

    System.out.println(a.temperatura() == 0);
    System.out.println(a.estaSolida() == true);
    // 0 -1 -2 -3 ...
    while (a.temperatura() > -273) a.esfriar();

    System.out.println(a.temperatura() == -273);

    a.esfriar(); // ignorar ou rejeitar

    System.out.println(a.temperatura() == -273);

    System.out.println(a.estaGasosa() == false);

    a.aquecer();

    System.out.println(a.temperatura() == -272);

    while ( ! a.estaGasosa()) a.aquecer();

    System.out.println(a.temperatura() == 100);

    // ESTADO: valor das variáveis (temperatura)
    // VÁLIDO: valor dentro do intervalo desejado
    // INTERAÇÃO/COMANDO/ALTERAÇÃO: métodos void verbo!
    // CONSULTA: leitura indireta de um atributo
    // PRÉ-CONDIÇÃO: o estado anterior de um objeto
    // PÓS-CONDIÇÃO: o estado posterior de um objeto

               // CONSTRUTOR: inicializar o objeto
    Agua a2 = new Agua(-5);
    // temperatura? 21
    System.out.println(a2.temperatura() == -5);
    System.out.println(a2);
    System.out.println(a2.toString());




    // O ESTADO de um objeto é calculado
    // pelo valor de seus atributos.

    // Normalmente, existem ESTADOS VÁLIDOS!

    // alterar atributo (é desencorajado)
    // alterando a temperatura
    // a.temperatura = 0; // estado
    // System.out.println(a.temperatura == 0); // true
    // consultar o estado
    // System.out.println(a.estaSolida() == true);



  }

}
