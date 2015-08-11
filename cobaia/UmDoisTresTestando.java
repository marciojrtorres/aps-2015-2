// Classes sempre iniciam com
// letra maiuscula
public class UmDoisTresTestando {
  
  // snippet: main (tab)
  public static void main(String[] args) {
    
    System.out.println("Testando ..."); 

    // Especificação
    // API
    // Teste (assertiva)
    // Princípio

    System.out.println(1 + 1); // previsível!
    System.out.println(1 + 1 == 2); // assertiva (true ou false)

    int v = 0;
    // increment
    for (int i = 0; i < 10; i++) { // 10x
      v = v + 1; // v++;
      // debug (observar)
      System.out.println(v);
    }
    System.out.println(v == 10); // assertiva

    //   0.1 + 0.1 + 0.1 + 0.1 + 0.1 
    // + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 == 1.0
    double d = 0.0;
    for (int i = 0; i < 10; i++) {
      d = d + 0.1;
    }
    System.out.println(d == 1.0); // assertiva falhou
    // 0.1 é uma dízima binária
    // System.out.println(0.1 + 0.1 + 0.1 === 0.3); 
    // Houve uma surpresa?    
    // Princípio da Menor Surpresa
    // Projetar para que não cause surpresa,
    // ou seja, seja previsível e comporte-se
    // como o usuário espera.

  }

} 