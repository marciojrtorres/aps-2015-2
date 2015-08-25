package oo;

public class Agua {
  // int temperatura; // 0
  // default: int, long, float, double = 0 (inicial)
  // default: boolean = false (inicial)
  // temperatura de -273 a +1000
  private int temperatura; // default
  // new Agua()
  public Agua() { // construtor sem argumentos
    this.temperatura = 21;
  }
  // new Agua(-5)
  public Agua(int t) { // construtor com argumento
    this.temperatura = t;
  }

  // consulta (tem retorno) não deve alterar estado
  public int temperatura() {
    // this é opcional (representa a classe)
    return this.temperatura;
  }

  // método para interagir (comando)
  // métodos que alteram o estado geralmente são void
  public void esfriar() {
    // this.temperatura = this.temperatura - 1;
    if (this.temperatura == -273) return;

    this.temperatura--;
  }

  public void aquecer() {
    // cláusula salva-guarda
    if (this.temperatura == 1000) return; // pára execução
    this.temperatura++;
  }

  public boolean estaSolida() {
    return this.temperatura <= 0; // retorno expressão booleana
  }

  public boolean estaGasosa() {
    return this.temperatura >= 100;
  }

  public String toString() {
    return "Agua a " + this.temperatura + " graus";
  }

}
