package friday;

public class Timer {

  private int seconds;

  public Timer(int s) {
    this.seconds = s;
  }
  // leitura/consulta
  public int seconds() {
    return this.seconds;
  }
  // interação/ação/comando
  public void tic() { // corrente de métodos
    if (this.seconds == 0) return;

    // dormir 1000ms (1s)
    try { Thread.sleep(1000); } catch(Exception e) {}

    // ação a ser feita a cada tic
    // como permitir a substituição da ação?
    System.out.print(".");

    this.seconds--;
    // ação a ser feita quando termina o timer
    // como permitir a substituição da ação?
    if (this.seconds == 0) System.out.println("end");
  }

  // sobrecarga de método (polimorfismo ad-hoc)
  public void tic(int s) {
    for (; s > 0; s--) tic();
  }

  public boolean zero() { // consulta
    return this.seconds == 0;
  }
  // um dos problemas de projetar sistemas
  // orientados a objetos: ATRIBUIR RESPONSABILIDADES
  public void start() {
    while ( ! this.zero()) this.tic();
  }

  // regra básica: implementar toString
  public String toString() {
    return "Timer " + this.seconds + "s";
  }

  // objetos devem (quase sempre) ter o método equals
  public boolean equals(Timer otherTimer) { // implementação preliminar
    return (this.seconds == otherTimer.seconds);
  }

  public boolean greaterThan(Timer otherTimer) {
    return this.seconds > otherTimer.seconds;
  }

}
