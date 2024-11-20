package tarea16_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class programador1 {
    private JTextArea txtAreaResumen;

    public programador1() {
        JFrame frame = new JFrame("Registro de Programador");
        frame.setSize(500, 600); // Tamaño más grande
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout manual

        // Nombre
        JLabel lblNombre = new JLabel("NOMBRE:");
        lblNombre.setBounds(20, 20, 100, 25);
        frame.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(150, 20, 300, 25);
        frame.add(txtNombre);

        // Apellido
        JLabel lblApellido = new JLabel("APELLIDO:");
        lblApellido.setBounds(20, 60, 100, 25);
        frame.add(lblApellido);

        JTextField txtApellido = new JTextField();
        txtApellido.setBounds(150, 60, 300, 25);
        frame.add(txtApellido);

        // Género
        JLabel lblGenero = new JLabel("GÉNERO:");
        lblGenero.setBounds(20, 100, 100, 25);
        frame.add(lblGenero);

        JRadioButton rbMasculino = new JRadioButton("Masculino");
        rbMasculino.setBounds(150, 100, 100, 25);
        JRadioButton rbFemenino = new JRadioButton("Femenino");
        rbFemenino.setBounds(250, 100, 100, 25);
        ButtonGroup bgGenero = new ButtonGroup();
        bgGenero.add(rbMasculino);
        bgGenero.add(rbFemenino);
        frame.add(rbMasculino);
        frame.add(rbFemenino);

        // Lenguajes de Programación
        JLabel lblLenguajes = new JLabel("LENGUAJES:");
        lblLenguajes.setBounds(20, 140, 150, 25);
        frame.add(lblLenguajes);

        JCheckBox cbJava = new JCheckBox("Java");
        cbJava.setBounds(150, 140, 100, 25);
        JCheckBox cbPython = new JCheckBox("Python");
        cbPython.setBounds(250, 140, 100, 25);
        JCheckBox cbCSharp = new JCheckBox("C#");
        cbCSharp.setBounds(350, 140, 100, 25);
        frame.add(cbJava);
        frame.add(cbPython);
        frame.add(cbCSharp);

        // Cargo
        JLabel lblCargo = new JLabel("CARGO:");
        lblCargo.setBounds(20, 180, 100, 25);
        frame.add(lblCargo);

        JTextField txtCargo = new JTextField();
        txtCargo.setBounds(150, 180, 300, 25);
        frame.add(txtCargo);

        // Estado
        JLabel lblEstado = new JLabel("ESTADO:");
        lblEstado.setBounds(20, 220, 100, 25);
        frame.add(lblEstado);

        JCheckBox cbDisponible = new JCheckBox("Disponible");
        cbDisponible.setBounds(150, 220, 100, 25);
        JCheckBox cbOcupado = new JCheckBox("Ocupado");
        cbOcupado.setBounds(250, 220, 100, 25);
        frame.add(cbDisponible);
        frame.add(cbOcupado);

        // Botón Registrar
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(200, 260, 100, 30);
        frame.add(btnRegistrar);

        // Área de texto para mostrar los registros
        txtAreaResumen = new JTextArea();
        txtAreaResumen.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaResumen);
        scrollPane.setBounds(20, 310, 440, 200);
        frame.add(scrollPane);

        // Acción del botón Registrar
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resumen = new StringBuilder();

                resumen.append("Nombre: ").append(txtNombre.getText()).append("\n");
                resumen.append("Apellido: ").append(txtApellido.getText()).append("\n");
                
                resumen.append("Género: ");
                if (rbMasculino.isSelected()) {
                    resumen.append("Masculino");
                } else if (rbFemenino.isSelected()) {
                    resumen.append("Femenino");
                } else {
                    resumen.append("No especificado");
                }
                resumen.append("\n");

                resumen.append("Lenguajes: ");
                if (cbJava.isSelected()) resumen.append("Java ");
                if (cbPython.isSelected()) resumen.append("Python ");
                if (cbCSharp.isSelected()) resumen.append("C# ");
                resumen.append("\n");

                resumen.append("Cargo: ").append(txtCargo.getText()).append("\n");

                resumen.append("Estado: ");
                if (cbDisponible.isSelected()) {
                    resumen.append("Disponible");
                } else if (cbOcupado.isSelected()) {
                    resumen.append("Ocupado");
                } else {
                    resumen.append("No especificado");
                }
                resumen.append("\n\n");

                txtAreaResumen.append(resumen.toString());
                limpiarCampos(txtNombre, txtApellido, bgGenero, cbJava, cbPython, cbCSharp, txtCargo, cbDisponible, cbOcupado);
            }
        });

        frame.setVisible(true);
    }

    private void limpiarCampos(JTextField txtNombre, JTextField txtApellido, ButtonGroup bgGenero, 
                               JCheckBox cbJava, JCheckBox cbPython, JCheckBox cbCSharp, 
                               JTextField txtCargo, JCheckBox cbDisponible, JCheckBox cbOcupado) {
        txtNombre.setText("");
        txtApellido.setText("");
        bgGenero.clearSelection();
        cbJava.setSelected(false);
        cbPython.setSelected(false);
        cbCSharp.setSelected(false);
        txtCargo.setText("");
        cbDisponible.setSelected(false);
        cbOcupado.setSelected(false);
    }

    public static void main(String[] args) {
        new programador1();
    }
}