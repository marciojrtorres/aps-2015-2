package oo;

import java.io.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // construir uma classe que faça esse processo
    // no main se instancia e sua esse objeto

    // File unidade = new File("C:/"); // windows
    File unidade = new File("/home");

    long livre = 0L;
    long total = 0L;
    long usado = 0L;

    while (true) { // while true é um mau cheiro
        livre = unidade.getFreeSpace();
        total = unidade.getTotalSpace();
        if (total - livre != usado) {
            usado = total - livre;
            double gbUsado = usado / 1024.0 / 1024.0 / 1024.0;
            // o print não pode estar nessa classe (ou o main)
            // o comando System.out.println deve ser executado
            // por outro objeto
            System.out.println(usado);
            System.out.println(gbUsado);
        }
        Thread.sleep(1000); // dorme um segundo
    }
  }

}
