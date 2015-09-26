package oo;

public class Telefone {

  private String ddd;
  private String numero;

  public Telefone(String ddd, String numero) {
    // validação: ddd tenha 2 dígitos e numero tenha 8
    // if (naoEhValido) throw IllegalArgumentException("por que não é válido");
    this.ddd = ddd;
    this.numero = numero;
  }

  public Telefone(String numero) {
    this("53", numero);
  }

  public String getDdd() {
    return this.ddd;
  }

  public String getNumero() {
    return this.numero;
  }

  public String toString() {
    return "(" + this.ddd + ") " + this.numero;
  }

}
