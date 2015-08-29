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
    tic(1); // reutilizando uma lógica correta
  }
  // sobrecarga de método (polimorfismo)
  public void tic(int s) {
    if (s > this.seconds) {
      this.seconds = 0;
    } else {
      this.seconds -= s; // this.seconds = this.seconds - s;
    }
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
