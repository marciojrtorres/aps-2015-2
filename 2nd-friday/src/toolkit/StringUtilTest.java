package toolkit;

import static toolkit.StringUtil.reverse;

public class StringUtilTest {

  public static void main(String[] args) {

    String desenvolvimento = "desenvolvimento";
    String inverso = "otnemivlovnesed";
    System.out.println(StringUtil.reverse(desenvolvimento));
    System.out.println(StringUtil.reverse(desenvolvimento).equals(inverso));
    System.out.println(StringUtil.reverse("aps").equals("spa"));
    System.out.println(StringUtil.reverse("").equals(""));
    System.out.println(StringUtil.reverse("teste").equals("etset"));

    // trimLeft, trimRight, trim
    System.out.println("  palavra"); // espaço char ' ' ou int 32
    System.out.println(StringUtil.trimLeft("  palavra"));
    // assertiva
    System.out.println(StringUtil.trimLeft("    palavra").equals("palavra")); // true
    // assertiva
    System.out.println(StringUtil.trimLeft("  palavra  ").equals("palavra  ")); // true

    // a implementar: prazo 31 de agosto (mostrar em aula)
    System.out.println(StringUtil.trimRight("  palavra  ").equals("  palavra")); // true
    System.out.println(StringUtil.trimRight("p         ").equals("p"));
    // trimRight e trim
    System.out.println(StringUtil.trim("  palavra  ").equals("palavra"));
    System.out.println(StringUtil.trim("  uma frase  ").equals("uma frase"));

  }

}
