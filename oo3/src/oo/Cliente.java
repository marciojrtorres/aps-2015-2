package oo;

public class Cliente {

  private String nome;
  // vetor/array tem tamanho fixo
  private Telefone[] telefones = new Telefone[3];
  // mau cheiro: obsessão primitiva (usar primitivos ou tipos básicos para
  // modelar tipos que seriam complexos)
  // refatoração: extrair uma classe
  private int contTelefone = 0;

  public void addTelefone(Telefone telefone) {
    if (contTelefone < telefones.length) {
      this.telefones[contTelefone] = telefone;
      contTelefone++;
    }
  }

  // public void removeTelefone ... (exercício)

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Telefone[] getTelefones() {
    return this.telefones;
  }


  public String toString() {
    return "Cliente " + nome + " " + java.util.Arrays.toString(telefones);
  }

}
