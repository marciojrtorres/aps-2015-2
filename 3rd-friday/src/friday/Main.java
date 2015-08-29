package friday;

public class Main {

  public static void main(String[] args) {

    // Criar uma classe que represente um Timer (decrescer o tempo)
    Timer t1 = new Timer(30);
    System.out.println(t1.seconds()); // 30
    System.out.println(t1.seconds() == 30);
    System.out.println(t1); // t1.toString()

    t1.tic(); // decresce 1s
    System.out.println(t1); // Timer 29s
    System.out.println(t1.seconds() == 29);

    t1.tic(4); // decresce 4s
    System.out.println(t1); // Timer 25s
    System.out.println(t1.seconds() == 25);

    // casos excepcionais!
    t1.tic(30); // vai ficar negativo? não pode ser negativo (mínimo 0)
    System.out.println(t1); // Timer 0s
    System.out.println(t1.seconds() == 0);

    t1.tic(); // já está zero não fica negativo
    System.out.println(t1); // Timer 0s
    System.out.println(t1.seconds() == 0);

    Timer t2 = new Timer(45); // um objeto
    Timer t3 = new Timer(45); // outro objeto
    Timer t4 = new Timer(50);
    Timer t5 = new Timer(30);

    // tornando objetos comparáveis: se tem a mesma informação ou se equivalem
    System.out.println(t2 == t3); // true or false? == eh o mesmo objeto
    System.out.println(t2.equals(t3)); // true

    System.out.println(t4.greaterThan(t5));

    System.out.println(t5.greaterThan(t4) == false); // false

    // código que não compila é um erro no código/programação
    // código que não passa no teste: é um erro de lógica
  }

}
