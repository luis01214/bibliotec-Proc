package src.biblioteca;

import javax.swing.SwingUtilities;
import src.biblioteca.gui.VentanaBiblioteca;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaBiblioteca().setVisible(true);
        });
    }
}
