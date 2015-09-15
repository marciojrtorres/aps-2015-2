package friday;

public class Main {

  public static void main(String[] args) {

    Aviso aviso = new AvisoGrafico();

    Timer t = new Timer(5, aviso);

    System.out.println(t);

    t.start();

    Time t2 = new Time(2, new MeuAviso());
    t2.start();

    // Leitura:

  }

}
