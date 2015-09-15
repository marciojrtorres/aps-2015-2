package friday;

import javax.swing.*;
import java.awt.*;

public class AvisoGrafico implements Aviso {

  private JFrame frame = new JFrame();
  private boolean inOut = false;

  public AvisoGrafico() {
    frame.setSize(100,100);
    frame.getContentPane().setBackground(Color.RED);
    frame.setVisible(true);
  }

  public void aCadaTic() {
      frame.getContentPane()
        .setBackground((inOut = !inOut) ? Color.BLUE : Color.RED);
        // expressão ternária
  }

  public void quandoAcaba() {
    JOptionPane.showMessageDialog(frame, "TIME OVER");
    frame.dispose();
  }

}
