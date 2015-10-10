package toolkit;

// import static = referencia um método! (opcional)
import static toolkit.StringUtil.reverse;
// para evitar classificar
import static toolkit.StringUtil.endsWith;

// dependências e dependentes

// StringUtilTest depende de StringUtil
public class StringUtilTest {

  public static void main(String[] args) {
	System.out.println("Um teste Eclipse");  
	
    // API: Application Programming Interface
    // tipo de retorno  Classe  método(tipo do argumento)
    String s = StringUtil.duplicate("teste");
    System.out.println(s); // testeteste

    // StringUtil é orientada a objetos?
    // tem "new"? não -> não tem objeto
    // se não tem objeto então é estático!
    // estático o método pertence a classe
    // e equivale a um procedimento, que é
    // a base da programação procedimental

    // assertiva
    System.out.println(
      StringUtil.duplicate("aps").equals("apsaps")); // true

    // métodos da API do Java (já vem na linguagem)
    System.out.println("tads".startsWith("ta"));
    System.out.println("tads".startsWith("ds"));
    System.out.println("tads".toUpperCase()); // TADS

    // como manipular strings
    // Uma String é um agrupamento de caracteres
    // tecnicamente é um array (vetor) de char's
    System.out.println("a"); // string com um char
    System.out.println('a'); // um char
    // System.out.println('aps'); // erro
    // A string "aps" é na verdade um array de char
    // ['a', 'p', 's']

    String s1 = "aps";
    char[] c1 = {'a', 'p', 's'};

    System.out.println(s1);
    System.out.println(c1);

    // converter uma String em um vetor de char
    // lidar com os caracteres
    // converter um vetor de char em String de volta

    String s2 = "tads";
    // {'t', 'a', 'd', 's'}
    //   0    1    2    3
    char[] c2 = s2.toCharArray(); // único método permitido
    System.out.println(c2.length);
    System.out.println(c2[2]);
    c2[0] = 'p';
    System.out.println(c2);
    c2[1] = (char) (c2[1] + 1);
    c2[2] = (char) (c2[2] + 1);
    c2[3] = (char) (c2[3] + 1);

    System.out.println(c2);

    System.out.println((int) 'p'); // 'p' == 112
    System.out.println((char) 113); // 113 == 'q'

    // tornando array de char uma string
    String s3 = new String(c2);
    System.out.println(s3);

    String desenvolvimento = "desenvolvimento";
    String inverso = "otnemivlovnesed";
    System.out.println(StringUtil.reverse(desenvolvimento));
    // assertiva (casos felizes)
    System.out.println(StringUtil.reverse("aps").equals("spa"));
    // assertiva (casos excepcionais)
    System.out.println(StringUtil.reverse("").equals(""));
    System.out.println(reverse("teste"));
    // os marcos? sufixo/string
    // marcos os? string/sufixo

    System.out.println("testando endsWith ---------------");

    System.out.println(endsWith("marcos", "os") == true);  // true
    System.out.println(endsWith("marcos", "ma") == false); // true
    System.out.println(endsWith("felipe", "E")  == false); // true
    System.out.println(endsWith("felipe ", "d") == false); // true



  }

}
