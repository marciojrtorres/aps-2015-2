package friday;

public class Main {

  public static void main(String[] args) {

    // abstração / polimorfismo / mutabilidade
    Timer t = new Timer(5); // instância de Timer
    // as instâncias (objetos) retém estado
    // como o objeto está? o valor de seus atributos
    System.out.println(t);
    System.out.println(t.seconds() == 5);
    t.start();

  }

}
