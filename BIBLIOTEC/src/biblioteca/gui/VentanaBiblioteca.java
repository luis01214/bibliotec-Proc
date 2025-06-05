package src.biblioteca.gui;

import javax.swing.*;
import java.awt.*;

public class VentanaBiblioteca extends JFrame {

    public VentanaBiblioteca() {
        setTitle("BIBLIOTEC");
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel superior (título y logos)
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBackground(new Color(173, 216, 230));
        panelSuperior.setPreferredSize(new Dimension(800, 50));
        panelSuperior.add(new JLabel("   IMG. LOGO"), BorderLayout.WEST);

        JLabel lblTitulo = new JLabel("BIBLIOTEC", JLabel.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        panelSuperior.add(lblTitulo, BorderLayout.CENTER);

        panelSuperior.add(new JLabel("IMG. LOGO   "), BorderLayout.EAST);
        add(panelSuperior, BorderLayout.NORTH);

        // Panel izquierdo (módulos)
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setPreferredSize(new Dimension(160, 500));
        panelIzquierdo.setBackground(Color.WHITE);

        String[] modulos = { "Gestión biblioteca", "Gestión préstamo", "Consultar libros" };
        for (int i = 0; i < modulos.length; i++) {
            JButton boton = new JButton(modulos[i]);
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);
            boton.setMaximumSize(new Dimension(140, 40));
            boton.setFocusPainted(false);
            if (i == 0) {
                boton.setBackground(new Color(255, 204, 153)); // solo el primero naranja claro
            } else {
                boton.setBackground(new Color(224, 236, 255));
            }
            panelIzquierdo.add(Box.createVerticalStrut(10));
            panelIzquierdo.add(boton);
        }
        add(panelIzquierdo, BorderLayout.WEST);

        // Panel central
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(null); // diseño libre
        panelCentral.setBackground(Color.WHITE);

        JLabel fechaHora = new JLabel("12/03/2025 - Hora siempre fija");
        fechaHora.setFont(new Font("Segoe UI", Font.BOLD, 16));
        fechaHora.setForeground(Color.RED);
        fechaHora.setBounds(240, 10, 300, 30);
        panelCentral.add(fechaHora);

        String[] etiquetas = {
                "Nombre:", "Apellido Paterno:", "Apellido Materno:", "Nm. Ctrl:",
                "Carrera:", "Semestre:", "Registro:", "Ocupación:",
                "Firma electrónica:"
        };

        int x1 = 30, x2 = 200, y = 60, ancho = 140, alto = 25;
        JTextField[] camposTexto = new JTextField[7];

        for (int i = 0; i < 4; i++) {
            JLabel label = new JLabel(etiquetas[i]);
            label.setBounds(x1, y, 140, 20);
            panelCentral.add(label);

            JTextField field = new JTextField();
            field.setBounds(x2, y, ancho, alto);
            panelCentral.add(field);
            camposTexto[i] = field;

            JLabel label2 = new JLabel(etiquetas[i + 4]);
            label2.setBounds(x1 + 370, y, 140, 20);
            panelCentral.add(label2);

            JTextField field2 = new JTextField();
            field2.setBounds(x2 + 370, y, ancho, alto);
            panelCentral.add(field2);
            camposTexto[i + 3] = field2;

            y += 40;
        }

        // Registro (combo)
        JLabel lblRegistro = new JLabel("Registro:");
        lblRegistro.setBounds(x1, y, 140, 20);
        panelCentral.add(lblRegistro);

        JComboBox<String> cmbRegistro = new JComboBox<>(new String[] { "Entrada", "Salida" });
        cmbRegistro.setBounds(x2, y, ancho, alto);
        panelCentral.add(cmbRegistro);

        // Ocupación (combo)
        JLabel lblOcupacion = new JLabel("Ocupación:");
        lblOcupacion.setBounds(x1 + 370, y, 140, 20);
        panelCentral.add(lblOcupacion);

        JComboBox<String> cmbOcupacion = new JComboBox<>(new String[] { "Alumno", "Docente", "Visitante" });
        cmbOcupacion.setBounds(x2 + 370, y, ancho, alto);
        panelCentral.add(cmbOcupacion);

        // Firma electrónica
        JLabel lblFirma = new JLabel("Firma electrónica:");
        lblFirma.setBounds(x1, y + 40, 140, 20);
        panelCentral.add(lblFirma);

        JTextField txtFirma = new JTextField();
        txtFirma.setBounds(x2, y + 40, ancho, alto);
        panelCentral.add(txtFirma);

        // Botón de registro
        JButton btnRegistro = new JButton("Registro rápido");
        btnRegistro.setBounds(x2 + 140, y + 90, 200, 35);
        btnRegistro.setBackground(new Color(144, 238, 144));
        btnRegistro.setFont(new Font("Segoe UI", Font.BOLD, 16));
        panelCentral.add(btnRegistro);

        // Tabla de registros (solo título visual)
        JLabel lblTabla = new JLabel("TABLA DE REGISTROS");
        lblTabla.setBounds(x2 + 100, y + 140, 300, 30);
        lblTabla.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTabla.setForeground(Color.RED);
        panelCentral.add(lblTabla);

        add(panelCentral, BorderLayout.CENTER);
    }
}
