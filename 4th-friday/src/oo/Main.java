package oo;

public class Main {

  public static void main(String[] args) {
    // Padrão (Princípios) de Implementação
    // antecedem os Padrões de Projeto

    // Representação de Peso
    // int p = 28; // primitivo (pouco diz a respeito da informação)
    // Toda informação é dependente do domínio (28g, 28kg, 28tn, 28mg)

    // Peso p = new Peso(28000); // primeiro exemplo (persiste o problema)
    Peso p = Peso.emGramas(28000); // já com o método fábrica
    System.out.println(p); // 28.0kg

    // Princípio UAP (Uniform Access Principle - Princípio do Acesso Uniforme)
    // A informação deve ser obtida uniformemente sem
    // transparecer se é armazenada ou computada
    System.out.println(p.getGramas());
    System.out.println(p.getKilos()); // não sabe se há um atributo kilos ou se foi calculado
    System.out.println(p.getLibras());

    // Refatoração: mudança no código para melhorar algum aspecto
    // por exemplo, legibilidade (tornar o código mais claro)
    // Substituir o Construtor por um Método Fábrica Estático
    // Métodos Fábrica Estáticos são um Padrão de Implementação
    Peso p2 = Peso.emLibras(10); // 10 libras (não funciona, vai entender 10g)
    System.out.println(p2);

    Peso p3 = Peso.emKilos(30); // outro método fábrica
    System.out.println(p3.getGramas());

    Peso p4 = Peso.emGramas(255); // kg, g ou lb?
    System.out.println(p4);

    // Peso p5 = Peso.emGramas(-8000); // proibir (rejeitar)
    // System.out.println(p5);

    // Peso.emLibras(-1);

  }

}
