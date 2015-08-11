import javax.swing.JOptionPane;

public class Calc {

  public static void main(String[] args) {
    
    String a = "8"; // JOptionPane.showInputDialog("1ro num:");
    String b = "9"; // JOptionPane.showInputDialog("2do num:");

    // rejeita se conter qualquer caractere não número
    // FAIL-FAST!
    int x = Integer.parseInt(a); 
    int y = Integer.parseInt(b);

    System.out.println(x + y);

    // método: respeitar/honrar um contrato de entrada/saída
    // para tais entradas, tais saídas
    int r = Calc.soma(3, 5);
    System.out.println(r == 8);
    r = soma(4, 1);
    System.out.println(r == 5);

    System.out.println(soma(0, 0) == 0);

    int doisBilhoes = 2000000000;

    // essa linha quebra!
    // System.out.println(soma(doisBilhoes, doisBilhoes));

    // Qual é a API de multiplica?
    // multiplica(int,int):int
    // multiplica entra dois 'ints' e sai um 'int'
    System.out.println(multiplica(3, 4) == 12);
    // 5 vezes 500 milhões deve ultrapassar Integer.MAX_VALUE
    // deve lançar RuntimeException
    // System.out.println(multiplica(5, 500000000));

    System.out.println(subtrai(9, 3) == 6); // 9 - 3
    // façam outras assertivas

    // não pode usar a /
    System.out.println(divide(20, 5) == 4); 
    // façam outras assertivas
  }

  // Princípio DRY (Don't Repeat Yourself - Não Se Repita)
  // Evitar lógica duplicada

  public static int multiplica(int x, int y) {
    int r = 0;
    for (int i = 0; i < x; i++) r = soma(r, y);
    return r;
  }

  // assinatura do método: nome, argumentos, tipo de saída
  // API (Application Programming Interface)
  // Argumentos são inválidos *(CONTRATO)
  // PRINCÍPIO FAIL-FAST (faz quebrar)
  // até o limite de 2147483647
  public static int soma(int x, int y) {
    int r = x + y;
    if (x > 0 && y > 0 && r < 0) {
      throw new ArithmeticException("estouro de inteiro");
    }
    return r;
  }
  
}