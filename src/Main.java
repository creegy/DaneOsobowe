import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        DaneOsobowe daneOsobowe = new DaneOsobowe();
        JFrame okienko = new JFrame("Dane osobowe");
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienko.setSize(600, 200);
        okienko.setContentPane(daneOsobowe.getPanelGlowny());
//        okienko.pack();

        okienko.setVisible(true);
    }
}
