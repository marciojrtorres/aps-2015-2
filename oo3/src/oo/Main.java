package oo;

public class Main {

  public static void main(String[] args) {

    // relacionamentos entre objetos
    // 1 para muitos
    // mau cheiro no código e refatoração
    // Ex.: um sistema com clientes que guarde dados como
    // nome, ..., telefones

    Cliente c1 = new Cliente(); // **um** cliente
    c1.setNome("João Silva");
    c1.addTelefone(new Telefone("53",  "99776655")); // tem **até 3** telefones
    c1.addTelefone(new Telefone("32334455"));
    c1.addTelefone(new Telefone("55", "33448822"));
    c1.addTelefone(new Telefone("99883311")); // ? (ignorar!)

    System.out.println(c1.getTelefones()[1].getNumero());

    for (Telefone tel : c1.getTelefones()) {
        System.out.println(tel);
    }

    // c1.removeTelefone("32334455"); // duas opções: telefone a ser removido ou o índice
    // c1.removeTelefone(1); // duas opções: telefone a ser removido ou o índice

    System.out.println(c1);

    Telefone t1 = new Telefone("7733445");
    Telefone t2 = new Telefone("7733d445");
  }

}
