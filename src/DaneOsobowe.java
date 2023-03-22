import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaneOsobowe {
    private JPanel JPMainPanel;
    private JTextField Jimie;
    private JTextField Jnazwisko;
    private JButton jbZatwierdz;
    private JLabel jkomunikat;

    public DaneOsobowe() {
        jbZatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imiestr = Jimie.getText();
                String nazwiskostr = Jnazwisko.getText();
                jkomunikat.setText("witaj " + imiestr + " " + nazwiskostr);
            }
        });

    }
    JPanel getPanelGlowny() {
        return JPMainPanel;
    }
}
