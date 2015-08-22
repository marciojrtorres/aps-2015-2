package toolkit;

public class StringUtil {

  public static String duplicate(String s) {
    return s + s;
  }

  public static String reverse(String s) {
    char[] chars = s.toCharArray();
    char[] charsInvertidos = new char[chars.length];
    for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
      charsInvertidos[j] = chars[i];
    }
    return new String(charsInvertidos);
  }

  public static boolean endsWith(String str, String sufixo) {
    char[] chars = str.toCharArray();
    char[] charsSufixo = sufixo.toCharArray();
    for (int i = chars.length - 1, j = charsSufixo.length - 1;
         i >= 0 && j >= 0; i--, j--) {
      if (chars[i] != charsSufixo[j]) return false;
    }
    return true;
  }

}
