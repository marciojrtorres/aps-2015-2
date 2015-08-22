package toolkit;

public class StringUtil {

  public static String reverse(String s) {
    char[] chars = s.toCharArray();
    char[] charsInvertidos = new char[chars.length];
    for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
      charsInvertidos[j] = chars[i];
    }
    return new String(charsInvertidos);
  }

  public static String trimLeft(String s) {
    char[] chars = s.toCharArray(); // lidar com o vetor de char
    int deslocamento = 0;
    for (; deslocamento < chars.length; deslocamento++) {
      if (chars[deslocamento] != ' ') break;
    }
    int tamanho = chars.length - deslocamento;
    // informação de depuração (debug)
    // System.out.println(tamanho);
    char[] resultado = new char[tamanho]; // tamanho sem os espaço na frente
    for (int i = 0; i < resultado.length; i++) {
      resultado[i] = chars[i + deslocamento];
    }
    return new String(resultado);
  }


}
